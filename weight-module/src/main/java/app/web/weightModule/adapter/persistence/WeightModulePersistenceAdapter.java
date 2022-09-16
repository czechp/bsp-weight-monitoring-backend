package app.web.weightModule.adapter.persistence;

import app.web.weightModule.application.port.WeightModulePortFindAll;
import app.web.weightModule.domain.WeightModule;
import app.web.weightModule.domain.WeightModuleFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
class WeightModulePersistenceAdapter implements WeightModulePortFindAll {
    private final WeightModuleJpaRepository jpaRepository;

    @Override
    public List<WeightModule> findAllWeightModule(Pageable pageable) {
        return jpaRepository.findAll(pageable)
                .map(WeightModuleFactory::toWeightModuleDomain)
                .stream()
                .collect(Collectors.toList());
    }
}
