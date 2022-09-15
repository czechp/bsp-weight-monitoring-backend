package app.web.weightModule.domain;

import app.web.weightModule.adapter.persistence.ProductionLineSimpleEntity;
import app.web.weightModule.adapter.persistence.WeightModuleEntity;

class WeightModuleFactory {
    public static WeightModule toWeightModuleDomain(WeightModuleEntity weightModuleEntity) {
        final ProductInfoVO productInfo = new ProductInfoVO(weightModuleEntity.getProductUpRangeWeight(),
                weightModuleEntity.getProductDownRangeWeight());

        final ModuleStatusVO processStatus = new ModuleStatusVO(
                weightModuleEntity.getCurrentDosingDevice(),
                weightModuleEntity.getCurrentMeasure(),
                weightModuleEntity.isStatus()
        );

        final ProductionIndicatorsVO productionInfo = new ProductionIndicatorsVO(
                weightModuleEntity.getTotalMaterialWeight(),
                weightModuleEntity.getTotalProductPcs(),
                weightModuleEntity.getCorrectProductPercent()
        );

        return new WeightModule(weightModuleEntity.getId(),
                weightModuleEntity.getProductionLineSimpleEntity().getId(),
                weightModuleEntity.getProductionLineSimpleEntity().getLineName(),
                productInfo,
                processStatus,
                productionInfo);
    }

    public static WeightModuleEntity toWeightModuleEntity(WeightModule domain) {
        return new WeightModuleEntity(
                domain.getId(),
                new ProductionLineSimpleEntity(domain.getProductionLineId(), domain.getProductionLineName()),
                domain.getProductInfo().getUpRangeWeight(),
                domain.getProductInfo().getDownRangeWeight(),
                domain.getModuleStatus().getCurrentDosingDevice(),
                domain.getModuleStatus().getCurrentMeasure(),
                domain.getModuleStatus().isStatus(),
                domain.getProductionIndicators().getTotalMaterialWeight(),
                domain.getProductionIndicators().getTotalProductPcs(),
                domain.getProductionIndicators().getCorrectProductPercent()
                );
    }
}
