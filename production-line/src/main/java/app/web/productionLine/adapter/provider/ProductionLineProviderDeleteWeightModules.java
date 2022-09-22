package app.web.productionLine.adapter.provider;

import app.web.productionLine.application.port.crud.ProductionLinePortDeleteWeightModules;
import app.web.weightModule.WeightModuleFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class ProductionLineProviderDeleteWeightModules implements ProductionLinePortDeleteWeightModules {
    private final WeightModuleFacade weightModuleFacade;

    @Override
    public void deleteWeightModulesByProductionLineId(long productionLineId) {
        weightModuleFacade.deleteWeightModulesByProductionLineId(productionLineId);
    }
}
