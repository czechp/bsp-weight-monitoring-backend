package app.web.weightModule.domain;

import lombok.AccessLevel;
import lombok.Getter;

@Getter(AccessLevel.PACKAGE)
public class WeightModuleLast extends WeightModuleAbstract {
    private final ModuleLastInfoVO moduleLastInfo;

    public WeightModuleLast(long id,
                            long version,
                            long productionLineId,
                            String productionLineName,
                            ProductInfoVO productInfo,
                            ModuleStatusVO moduleStatus,
                            ProductionIndicatorsVO productionIndicators,
                            ModuleLastInfoVO moduleLastInfo
    ) {
        super(id, version, productionLineId, productionLineName, productInfo, moduleStatus, productionIndicators);
        this.moduleLastInfo = moduleLastInfo;
    }
}
