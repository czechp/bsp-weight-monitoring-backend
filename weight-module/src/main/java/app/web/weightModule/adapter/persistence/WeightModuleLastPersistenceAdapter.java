package app.web.weightModule.adapter.persistence;

import app.web.exception.NotFoundException;
import app.web.weightModule.application.port.query.WeightModuleLastPortFindAll;
import app.web.weightModule.application.port.query.WeightModuleLastPortFindByIdOrThrow;
import app.web.weightModule.domain.WeightModuleLast;
import app.web.weightModule.domain.WeightModuleLastFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
class WeightModuleLastPersistenceAdapter implements WeightModuleLastPortFindAll, WeightModuleLastPortFindByIdOrThrow {
    private final WeightModuleLastRepository repository;

    @Override
    public List<WeightModuleLast> findAllWeightModuleLast(Pageable pageable) {
        return repository.findAll(pageable)
                .stream()
                .map(WeightModuleLastFactory::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public WeightModuleLast findByIdOrThrowException(long id) {
        return repository.findById(id)
                .map(WeightModuleLastFactory::toDomain)
                .orElseThrow(()->new NotFoundException("Ostatni moduł ważący z id: " + id + " nie istnieje"));
    }
}
