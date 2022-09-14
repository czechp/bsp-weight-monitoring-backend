package app.web.weightModule.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class WeightModuleFactoryTest {
    @Test
    void toWeightModuleDomainTest() {
        //given
        final var weightModuleEntity = WeightModuleTestProvider.entity();
        //when
        final var weightModule = WeightModuleFactory.toDomain(weightModuleEntity);
        //then
        assertNotNull(weightModule);
    }

    @Test
    void toWeightModuleDomainProductInfoTest() {
        //given
        final var weightModuleEntity = WeightModuleTestProvider.entity();
        //when
        final var weightModule = WeightModuleFactory.toDomain(weightModuleEntity);
        //then
        assertNotNull(weightModule.getProductInfo());
        assertEquals(weightModuleEntity.getProductUpRangeWeight(), weightModule.getProductInfo().getUpRangeWeight());
        assertEquals(weightModuleEntity.getProductDownRangeWeight(), weightModule.getProductInfo().getDownRangeWeight());
    }

    @Test
    void toWeightModuleDomainModuleStatusTest() {
        //given
        final var weightModuleEntity = WeightModuleTestProvider.entity();
        //when
        final var weightModule = WeightModuleFactory.toDomain(weightModuleEntity);
        //then
        assertEquals(weightModuleEntity.getCurrentDosingDevice(), weightModule.getModuleStatus().getCurrentDosingDevice());
        assertEquals(weightModuleEntity.getCurrentMeasure(), weightModule.getModuleStatus().getCurrentMeasure());
        assertEquals(weightModuleEntity.isStatus(), weightModule.getModuleStatus().isStatus());
    }

    @Test
    void toWeightModuleDomainProductionInfoTest() {
        //given
        final var weightModuleEntity = WeightModuleTestProvider.entity();
        //given
        final var weightModule = WeightModuleFactory.toDomain(weightModuleEntity);
        //then
        assertEquals(weightModuleEntity.getTotalMaterialWeight(), weightModule.getProductionInfo().getTotalMaterialWeight());
        assertEquals(weightModuleEntity.getTotalProductPcs(), weightModule.getProductionInfo().getTotalProductPcs());
        assertEquals(weightModuleEntity.getCorrectProductPercent(), weightModule.getProductionInfo().getCorrectProductPercent());
    }

}