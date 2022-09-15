package app.web.weightModule.domain;

class WeightModule extends WeightModuleAbstract {
    WeightModule(long id, long productionLineId, String productionLineName, ProductInfoVO productInfo, ModuleStatusVO processStatus, ProductionIndicatorsVO productionIndicators) {
        super(id, productionLineId, productionLineName, productInfo, processStatus, productionIndicators);
    }
}
