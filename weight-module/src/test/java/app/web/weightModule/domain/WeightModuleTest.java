package app.web.weightModule.domain;

import app.web.utilities.tools.RandomValueGenerator;
import app.web.weightModule.application.dto.WeightModuleUpdateDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightModuleTest {
    @Test
    void updateInfoTest() {
        //given
        final var weightModuleUpdateDto = new WeightModuleUpdateDto(
                RandomValueGenerator.randomFloat(),
                RandomValueGenerator.randomFloat(),
                RandomValueGenerator.randomInt(),
                RandomValueGenerator.randomFloat(),
                RandomValueGenerator.randomBoolean(),
                RandomValueGenerator.randomFloat(),
                RandomValueGenerator.randomLong(),
                RandomValueGenerator.randomFloat()
        );
        WeightModule weightModule = WeightModuleTestProvider.domain();
        //when
        WeightModule updatedWeightModule = weightModule.updateData(weightModuleUpdateDto);
        //then
        assertEquals(weightModuleUpdateDto.getProductUpRangeWeight(), updatedWeightModule.getProductInfo().getUpRangeWeight());
        assertEquals(weightModuleUpdateDto.getProductDownRangeWeight(), updatedWeightModule.getProductInfo().getDownRangeWeight());
        assertEquals(weightModuleUpdateDto.getCurrentDosingDevice(), updatedWeightModule.getModuleStatus().getCurrentDosingDevice());
        assertEquals(weightModuleUpdateDto.getCurrentMeasure(), updatedWeightModule.getModuleStatus().getCurrentMeasure());
        assertEquals(weightModuleUpdateDto.isStatus(), updatedWeightModule.getModuleStatus().isStatus());
        assertEquals(weightModuleUpdateDto.getTotalMaterialWeight(), updatedWeightModule.getProductionIndicators().getTotalMaterialWeight());
        assertEquals(weightModuleUpdateDto.getTotalProductPcs(), updatedWeightModule.getProductionIndicators().getTotalProductPcs());
        assertEquals(weightModuleUpdateDto.getCorrectProductPercent(), updatedWeightModule.getProductionIndicators().getCorrectProductPercent());




    }
}

