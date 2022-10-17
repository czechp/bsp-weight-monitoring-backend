package app.web.application.useCase;

import app.web.application.port.crud.DosingDevicePortCRUD;
import app.web.dosingDevice.dto.DosingDeviceUpdateDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@ExtendWith(MockitoExtension.class)
class DosingDeviceUseCaseUpdateTest {
    @Mock
    DosingDevicePortCRUD portCRUD;

    @Test
    void updateDosingDevicesByModuleIdTest(){
        //given
        final var moduleId = 1L;
        List<DosingDeviceUpdateDto> newData = provideListOfDto();
        //when
        Mockito.when(portCRUD.findByModuleId(moduleId, true)).thenReturn(provideDomainList());
        //then
    }

    private List<DosingDeviceUpdateDto> provideListOfDto() {
        return IntStream.range(0, 10)
                .boxed()
                .map(n -> new DosingDeviceUpdateDto() {
                    @Override
                    public int getRecordNumber() {
                        return n;
                    }

                    @Override
                    public float getLastMeasure() {
                        return (float)n;
                    }

                    @Override
                    public int getAmountBelowMeasures() {
                        return n;
                    }

                    @Override
                    public int getAmountCorrectMeasures() {
                        return n;
                    }

                    @Override
                    public int getAmountAboveMeasures() {
                        return n;
                    }

                    @Override
                    public float getAverageMeasure() {
                        return (float)n;
                    }

                    @Override
                    public int getCorrectMeasuresPercent() {
                        return n;
                    }

                    @Override
                    public int getTotalMaterial() {
                        return n;
                    }
                })
                .collect(Collectors.toList());
    }
}