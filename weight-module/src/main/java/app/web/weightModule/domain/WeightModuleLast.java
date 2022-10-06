package app.web.weightModule.domain;

public class WeightModuleLast extends WeightModuleAbstract {
    private final ModuleLastInfoVO moduleLastInfo;
    public WeightModuleLast(long id,
                            long productionLineId,
                            String productionLineName,
                            ProductInfoVO productInfo,
                            ModuleStatusVO moduleStatus,
                            ProductionIndicatorsVO productionIndicators,
                            ModuleLastInfoVO moduleLastInfo
    ) {
        super(id, productionLineId, productionLineName, productInfo, moduleStatus, productionIndicators);
        this.moduleLastInfo = moduleLastInfo;
    }
}
