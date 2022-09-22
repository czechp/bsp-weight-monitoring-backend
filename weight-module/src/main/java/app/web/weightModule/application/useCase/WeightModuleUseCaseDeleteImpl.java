package app.web.weightModule.application.useCase;

import app.web.weightModule.application.port.crud.WeightModulePortRemove;
import app.web.weightModule.application.port.query.WeightModulePortFindById;
import app.web.weightModule.domain.WeightModule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
class WeightModuleUseCaseDeleteImpl implements WeightModuleUseCaseDelete {
    private final WeightModulePortFindById portFindById;
    private final WeightModulePortRemove portRemove;

    @Override
    @Transactional
    public WeightModule deleteWeightModuleById(long id) {
        WeightModule weightModule = portFindById.findByIdWeightModuleOrThrowException(id);
        portRemove.removeWeightModule(weightModule);
        return weightModule;
    }
}
