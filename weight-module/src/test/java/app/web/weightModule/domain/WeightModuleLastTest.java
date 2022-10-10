package app.web.weightModule.domain;

import app.web.weightModule.application.dto.WeightModuleLastUpdateDto;
import app.web.weightModule.application.dto.WeightModuleUpdateDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightModuleLastTest {
    @Test
    @DisplayName("Extends WeightModuleAbstract")
    void extendsSuperclassTest() {
        //given
        //when
        //then
        assertTrue(WeightModuleAbstract.class.isAssignableFrom(WeightModuleLast.class));
    }

    @Test
    @DisplayName("Update data")
    void updateWeightModuleLastTest(){
        //given
        final  var weightModuleLast = WeightModuleLastTestProvider.getDomain();
        final var updateDto = provideUpdateDto();
        final var lastUpdateDto = provideLastUpdateDto();
        //when
        WeightModuleLast updatedModule = weightModuleLast.updateData(updateDto, lastUpdateDto);
        //then
        assertEquals(lastUpdateDto.getIncorrectProductPcs(), updatedModule.getModuleLastInfo().getIncorrectProductPcs());
        assertEquals(lastUpdateDto.getWeightDifference(), updatedModule.getModuleLastInfo().getWeightDifference());
        assertEquals(lastUpdateDto.getCorrectToOverdosePercent(), updatedModule.getModuleLastInfo().getCorrectToOverdosePercent());
        assertEquals(lastUpdateDto.getNotRefilledProductPcs(), updatedModule.getModuleLastInfo().getNotRefilledProductPcs());
        assertEquals(lastUpdateDto.getOverFilledProductPcs(), updatedModule.getModuleLastInfo().getOverFilledProductPcs());
        assertEquals(lastUpdateDto.getOverFilledToNotRefilledPercent(), updatedModule.getModuleLastInfo().getOverFilledToNotRefilledPercent());

    }

    private static WeightModuleLastUpdateDto provideLastUpdateDto() {
        return new WeightModuleLastUpdateDto(123_000, -320.f, 34.0f, 100_000, 230_000, 32.f);
    }

    private static WeightModuleUpdateDto provideUpdateDto() {
        return new WeightModuleUpdateDto(
                10.0f,
                13.0f,
                11,
                12f,
                true,
                232_000f,
                321_000L,
                32.1f
        );
    }
}