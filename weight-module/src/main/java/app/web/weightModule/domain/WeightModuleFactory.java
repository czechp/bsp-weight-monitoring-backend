package app.web.weightModule.domain;

import app.web.weightModule.adapter.persistence.WeightModuleEntity;

class WeightModuleFactory {
    public static WeightModule toDomain(WeightModuleEntity weightModuleEntity) {
        final ProductInfoVO productInfo = new ProductInfoVO(weightModuleEntity.getProductUpRangeWeight(),
                weightModuleEntity.getProductDownRangeWeight());

        final ModuleStatusVO processStatus = new ModuleStatusVO(
                weightModuleEntity.getCurrentDosingDevice(),
                weightModuleEntity.getCurrentMeasure(),
                weightModuleEntity.isStatus()
        );

        final ProductionInfoVO productionInfo = new ProductionInfoVO(
                weightModuleEntity.getTotalMaterialWeight(),
                weightModuleEntity.getTotalProductPcs(),
                weightModuleEntity.getCorrectProductPercent()
        );

        return new WeightModule(weightModuleEntity.getId(), productInfo, processStatus, productionInfo);
    }
}
