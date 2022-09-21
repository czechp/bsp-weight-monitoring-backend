package app.web.weightModule.application.useCase;

import app.web.weightModule.application.port.query.WeightModulePortFindByProductionLineId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
class WeightModuleUseCaseCreateTest {
    @Mock
    WeightModulePortFindProductionLineById portFindProductionLineById;
    @Mock
    WeightModulePortSave portSave;

    WeightModuleUseCaseCreate weightModuleUseCaseCreate;

    @BeforeEach
    void init() {
        this.weightModuleUseCaseCreate = new WeightModuleUseCaseCreateImpl(portFindProductionLineById, portSave);
    }

    @Test
    void createWeightModuleTest() {
        //given
        final var productionLineId = 1L;
        final var productionLineName = "Line name";
        final var weightModuleCreateDto = new WeightModuleCreateDto(productionLineId);
        final var productionLineFacadeDto = new ProductionLineFacadeDto(productionLineId, productionLineName);
        //when
        Mockito.when(portFindProductionLineById.findProductionLineById(anyLong())).thenReturn(Optional.of(productionLineFacadeDto));
        final var createdWeightModule =weightModuleUseCaseCreate.createWeighModule(weightModuleCreateDto);
        //then
        assertNotNull(createdWeightModule);
        assertEquals(productionLineId, createdWeightModule.getProductionLineId());
    }

}