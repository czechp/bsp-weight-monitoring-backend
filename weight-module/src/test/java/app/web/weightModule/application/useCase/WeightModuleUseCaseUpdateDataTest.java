package app.web.weightModule.application.useCase;

import app.web.utilities.tools.RandomValueGenerator;
import app.web.weightModule.application.dto.WeightModuleUpdateDto;
import app.web.weightModule.application.port.crud.WeightModulePortSave;
import app.web.weightModule.application.port.query.WeightModulePortFindById;
import app.web.weightModule.domain.WeightModule;
import app.web.weightModule.domain.WeightModuleTestProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class WeightModuleUseCaseUpdateDataTest {

    @Mock
    WeightModulePortFindById portFindById;

    @Mock
    WeightModulePortSave portSave;

    WeightModuleUseCaseUpdateData useCaseUpdateData;

    @BeforeEach
    void init() {
        this.useCaseUpdateData = new WeightModuleUseCaseUpdateDataImpl(portFindById, portSave);
    }

    @Test
    void updateWeightModuleDataTest() {
        //given
        final var weightModuleId = 1L;
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
        //when
        Mockito.when(portFindById.findByIdWeightModuleOrThrowException(anyLong())).thenReturn(WeightModuleTestProvider.domain());
        WeightModule updatedWeightModule = useCaseUpdateData.updateWeightModuleData(weightModuleId, weightModuleUpdateDto);
        //then
        Mockito.verify(portSave, times(1)).saveWeightModule(any());
    }
}