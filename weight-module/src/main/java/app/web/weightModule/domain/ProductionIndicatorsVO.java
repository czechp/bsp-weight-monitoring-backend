package app.web.weightModule.domain;

import lombok.AccessLevel;
import lombok.Getter;

@Getter(AccessLevel.PACKAGE)
class ProductionIndicatorsVO {
    final float totalMaterialWeight;
    final long totalProductPcs;
    final float correctProductPercent;

    ProductionIndicatorsVO(float totalMaterialWeight, long totalProductPcs, float correctProductPercent) {
        this.totalMaterialWeight = totalMaterialWeight;
        this.totalProductPcs = totalProductPcs;
        this.correctProductPercent = correctProductPercent;
    }
}
