package app.web.weightModule.domain;

import app.web.weightModule.application.dto.WeightModuleUpdateDto;

public class WeightModule extends WeightModuleAbstract {
    WeightModule(long id, long productionLineId, String productionLineName, ProductInfoVO productInfo, ModuleStatusVO processStatus, ProductionIndicatorsVO productionIndicators) {
        super(id, productionLineId, productionLineName, productInfo, processStatus, productionIndicators);
    }

    public WeightModule(long productionLineId, String productionLineName) {
        super(productionLineId, productionLineName);
    }


    public WeightModule updateData(WeightModuleUpdateDto weightModuleUpdateDto) {
        super.updateBasicData(weightModuleUpdateDto);
        return this;
    }
}
