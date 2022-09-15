package app.web.weightModule.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(value = AccessLevel.PROTECTED)
@Setter(value = AccessLevel.PROTECTED)
abstract class WeightModuleAbstract {
    private long id;
    private ProductInfoVO productInfo;
    private ModuleStatusVO moduleStatus;
    private ProductionIndicatorsVO productionInfo;

    public WeightModuleAbstract(long id,
                                ProductInfoVO productInfo,
                                ModuleStatusVO moduleStatus,
                                ProductionIndicatorsVO productionInfo) {
        this.id = id;
        this.productInfo = productInfo;
        this.moduleStatus = moduleStatus;
        this.productionInfo = productionInfo;
    }
}