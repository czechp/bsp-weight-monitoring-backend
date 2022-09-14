package app.web.weightModule.domain;

class WeightModule extends WeightModuleAbstract {
    WeightModule(long id, ProductInfoVO productInfo, ModuleStatusVO processStatus, ProductionInfoVO productionInfoVO) {
        super(id, productInfo, processStatus, productionInfoVO);
    }
}
