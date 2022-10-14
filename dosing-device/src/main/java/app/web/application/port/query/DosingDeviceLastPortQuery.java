package app.web.application.port.query;

import app.web.application.dto.DosingDeviceQueryDto;
import app.web.domain.DosingDevice;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DosingDeviceLastPortQuery {
    List<DosingDeviceQueryDto> finaAllLast(Pageable pageable);
}
