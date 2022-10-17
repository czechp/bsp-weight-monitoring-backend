package app.web.application.useCase;

import app.web.domain.DosingDevice;
import app.web.dosingDevice.dto.DosingDeviceUpdateDto;

import java.util.List;

public interface DosingDeviceUseCaseUpdate {
    List<DosingDevice> updateDosingDevicesByModuleId(long moduleId, List<DosingDeviceUpdateDto> newValues, boolean isFirst);
}
