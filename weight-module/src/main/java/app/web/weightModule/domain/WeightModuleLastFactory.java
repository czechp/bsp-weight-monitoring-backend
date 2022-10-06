package app.web.weightModule.domain;

import app.web.weightModule.adapter.persistence.ProductionLineSimpleEntity;
import app.web.weightModule.adapter.persistence.WeightModuleLastEntity;

class WeightModuleLastFactory {
    static WeightModuleLast toDomain(WeightModuleLastEntity entity) {
        ProductInfoVO productInfo = new ProductInfoVO(entity.getProductUpRangeWeight(), entity.getProductDownRangeWeight());
        ModuleStatusVO moduleStatus = new ModuleStatusVO(entity.getCurrentDosingDevice(), entity.getCurrentMeasure(), entity.isStatus());
        ProductionIndicatorsVO productionIndicators = new ProductionIndicatorsVO(entity.getTotalMaterialWeight(), entity.getTotalProductPcs(), entity.getCorrectProductPercent());
        ModuleLastInfoVO moduleLastInfo = new ModuleLastInfoVO(
                entity.getIncorrectProductPcs(),
                entity.getWeightDifference(),
                productionIndicators.getCorrectProductPercent(),
                entity.getCorrectToOverdosePercent(),
                entity.getNotRefilledProductPcs(),
                entity.getOverFilledProductPcs(),
                entity.getOverFilledToNotRefilledPercent()
        );

        return new WeightModuleLast(
                entity.getId(),
                entity.getVersion(),
                entity.getProductionLineSimpleEntity().getId(),
                entity.getProductionLineSimpleEntity().getLineName(),
                productInfo,
                moduleStatus,
                productionIndicators,
                moduleLastInfo
        );
    }

    static WeightModuleLastEntity toEntity(WeightModuleLast domain) {
        return new WeightModuleLastEntity(
                domain.getId(),
                domain.getVersion(),
                new ProductionLineSimpleEntity(domain.getProductionLineId(), domain.getProductionLineName()),
                domain.getProductInfo().getUpRangeWeight(),
                domain.getProductInfo().getDownRangeWeight(),
                domain.getModuleStatus().getCurrentDosingDevice(),
                domain.getModuleStatus().getCurrentMeasure(),
                domain.getModuleStatus().isStatus(),
                domain.getProductionIndicators().getTotalMaterialWeight(),
                domain.getProductionIndicators().getTotalProductPcs(),
                domain.getProductionIndicators().getCorrectProductPercent(),
                domain.getModuleLastInfo().getIncorrectProductPcs(),
                domain.getModuleLastInfo().getWeightDifference(),
                domain.getModuleLastInfo().getCorrectToOverdosePercent(),
                domain.getModuleLastInfo().getNotRefilledProductPcs(),
                domain.getModuleLastInfo().getOverFilledProductPcs(),
                domain.getModuleLastInfo().getOverFilledToNotRefilledPercent());
    }
}
