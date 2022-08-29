package app.web.template.account.application.service;

import app.web.template.account.adapter.persistence.AccountRole;
import app.web.template.account.application.port.AccountPortDelete;
import app.web.template.account.application.port.AccountPortEmitDeleteEvent;
import app.web.template.account.application.port.AccountPortFindById;
import app.web.template.account.application.port.AccountPortFindByUsername;
import app.web.template.account.application.useCase.AccountUseCaseDelete;
import app.web.template.account.domain.Account;
import app.web.template.configuration.security.SecurityCurrentUser;
import app.web.template.exception.NotEnoughPrivilegesException;
import app.web.template.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
class AccountUseCaseDeleteImpl implements AccountUseCaseDelete {
    private final AccountPortFindById accountPortFindById;
    private final AccountPortDelete accountPortDelete;
    private final AccountPortFindByUsername accountFindByUsername;
    private final AccountPortEmitDeleteEvent accountPortEmitDeleteEvent;
    private final SecurityCurrentUser securityCurrentUser;

    @Override
    @Transactional
    public void deleteAccountById(long accountId) {
        Account account = accountPortFindById.findAccountById(accountId)
                .orElseThrow(() -> new NotFoundException("Account with id: " + accountId + " does not exist."));
        if (userIsAccountOwner(account))
            deleteAccount(account);
        else throw new NotEnoughPrivilegesException("You have no permission to delete this account");

    }

    private boolean userIsAccountOwner(Account account) {
        String currentUser = securityCurrentUser.getCurrentUser();
        boolean userIsAccountOwner = userIsAccountOwner(account, currentUser);
        boolean userIsAdmin = userIsAdmin(currentUser);
        return userIsAccountOwner || userIsAdmin;
    }

    private boolean userIsAdmin(String currentUser) {
        return accountFindByUsername.findAccountByUsername(currentUser)
                .map(Account::getAccountRole)
                .filter(accountRole -> accountRole.equals(AccountRole.ADMIN))
                .isPresent();
    }

    private boolean userIsAccountOwner(Account account, String currentUser) {
        return account.getUsername().equals(currentUser);
    }

    private void deleteAccount(Account account) {
        accountPortEmitDeleteEvent.emitAccountDeleteEvent(account);
        accountPortDelete.deleteAccount(account);
    }


}
