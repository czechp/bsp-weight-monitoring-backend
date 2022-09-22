package app.web.weightModule.application.service;

import app.web.weightModule.WeightModuleFacade;
import app.web.weightModule.application.useCase.WeightModuleUseCaseDelete;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class WeightModuleFacadeImpl implements WeightModuleFacade {
    private final WeightModuleUseCaseDelete useCaseDelete;
    @Override
    public void deleteWeightModulesByProductionLineId(long productionLineId) {
        useCaseDelete.deleteWeightMoulesByProductionLineId(productionLineId);
    }
}
