package app.web.weightModule.application.service;

import app.web.weightModule.WeightModuleFacade;
import app.web.weightModule.application.port.query.WeightModulePortFindByProductionLineId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.transaction.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@SpringBootTest
@Transactional
@ActiveProfiles({"test"})
class WeightModuleFacadeTest {
    @Autowired
    WeightModuleFacade weightModuleFacade;
    @Autowired
    WeightModulePortFindByProductionLineId portFindByProductionLineId;

    @Test
    void deleteWeightModuleByProductionIdTest() {
        //given
        final var productionLineId = 1L;
        //when
        weightModuleFacade.deleteWeightModulesByProductionLineId(productionLineId);
        final var existingWeightModules = portFindByProductionLineId.findByProductionLineIdWeightModules(productionLineId);
        //then
        assertThat(existingWeightModules, hasSize(0));
    }
}
