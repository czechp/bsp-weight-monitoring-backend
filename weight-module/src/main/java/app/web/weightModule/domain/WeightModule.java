package app.web.weightModule.domain;

class WeightModule extends WeightModuleAbstract {
    WeightModule(long id, ProductInfoVO productInfo, ModuleStatusVO processStatus, ProductionIndicatorsVO productionIndicatorsVO) {
        super(id, productInfo, processStatus, productionIndicatorsVO);
    }
}
