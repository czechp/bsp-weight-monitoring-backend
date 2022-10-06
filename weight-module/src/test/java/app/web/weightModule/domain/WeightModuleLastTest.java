package app.web.weightModule.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WeightModuleLastTest {
    @Test
    @DisplayName("Extends WeightModuleAbstract")
    void extendsSuperclassTest() {
        //given
        //when
        //then
        assertTrue(WeightModuleAbstract.class.isAssignableFrom(WeightModuleLast.class));
    }
}