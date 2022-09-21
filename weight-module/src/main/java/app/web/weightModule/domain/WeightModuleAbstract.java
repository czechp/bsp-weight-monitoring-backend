package app.web.weightModule.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(value = AccessLevel.PROTECTED)
@Setter(value = AccessLevel.PROTECTED)
abstract class WeightModuleAbstract {
    private long id;
    private long productionLineId;
    private String productionLineName;
    private ProductInfoVO productInfo;
    private ModuleStatusVO moduleStatus;
    private ProductionIndicatorsVO productionIndicators;

    public WeightModuleAbstract(long id,
                                long productionLineId,
                                String productionLineName,
                                ProductInfoVO productInfo,
                                ModuleStatusVO moduleStatus,
                                ProductionIndicatorsVO productionIndicators) {
        this.id = id;
        this.productionLineId = productionLineId;
        this.productionLineName = productionLineName;
        this.productInfo = productInfo;
        this.moduleStatus = moduleStatus;
        this.productionIndicators = productionIndicators;
    }

    public WeightModuleAbstract(long productionLineId, String productionLineName) {
        this.productionLineId = productionLineId;
        this.productionLineName = productionLineName;
        this.productInfo = new ProductInfoVO();
        this.moduleStatus = new ModuleStatusVO();
        this.productionIndicators = new ProductionIndicatorsVO();
    }
}
