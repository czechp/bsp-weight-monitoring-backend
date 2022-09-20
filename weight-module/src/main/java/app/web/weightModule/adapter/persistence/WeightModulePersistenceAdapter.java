package app.web.weightModule.adapter.persistence;

import app.web.exception.NotFoundException;
import app.web.weightModule.application.port.query.WeightModulePortFindAll;
import app.web.weightModule.application.port.query.WeightModulePortFindById;
import app.web.weightModule.application.port.query.WeightModulePortFindByProductionLineId;
import app.web.weightModule.domain.WeightModule;
import app.web.weightModule.domain.WeightModuleFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
class WeightModulePersistenceAdapter implements
        WeightModulePortFindAll,
        WeightModulePortFindById,
        WeightModulePortFindByProductionLineId
{
    private final WeightModuleJpaRepository jpaRepository;

    @Override
    public List<WeightModule> findAllWeightModule(Pageable pageable) {
        return jpaRepository.findAll(pageable)
                .map(WeightModuleFactory::toWeightModuleDomain)
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public WeightModule findByIdWeightModuleOrThrowException(long id) {
        return jpaRepository.findById(id)
                .map(WeightModuleFactory::toWeightModuleDomain)
                .orElseThrow(()->new NotFoundException("Weight module with id: " + id + " does not exist"));
    }

    @Override
    public List<WeightModule> findByProductionLineIdWeightModules(long id) {
        return jpaRepository.findByProductionLineSimpleEntity_Id(id)
                .stream()
                .map(WeightModuleFactory::toWeightModuleDomain)
                .collect(Collectors.toList());
    }
}
