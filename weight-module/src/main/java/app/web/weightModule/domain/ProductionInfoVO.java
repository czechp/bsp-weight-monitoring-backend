package app.web.weightModule.domain;

import lombok.AccessLevel;
import lombok.Getter;

@Getter(AccessLevel.PACKAGE)
class ProductionInfoVO {
    final float totalMaterialWeight;
    final long totalProductPcs;
    final float correctProductPercent;

    ProductionInfoVO(float totalMaterialWeight, long totalProductPcs, float correctProductPercent) {
        this.totalMaterialWeight = totalMaterialWeight;
        this.totalProductPcs = totalProductPcs;
        this.correctProductPercent = correctProductPercent;
    }
}
