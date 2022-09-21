package app.web.weightModule.domain;

import lombok.Getter;

public class WeightModule extends WeightModuleAbstract {
    WeightModule(long id, long productionLineId, String productionLineName, ProductInfoVO productInfo, ModuleStatusVO processStatus, ProductionIndicatorsVO productionIndicators) {
        super(id, productionLineId, productionLineName, productInfo, processStatus, productionIndicators);
    }

    public WeightModule(long productionLineId, String productionLineName) {
        super(productionLineId, productionLineName);
    }
}
