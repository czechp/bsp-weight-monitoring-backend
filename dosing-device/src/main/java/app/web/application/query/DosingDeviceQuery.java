package app.web.application.query;

import app.web.application.dto.DosingDeviceQueryDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DosingDeviceQuery {
    List<DosingDeviceQueryDto> findAllFirst(Pageable pageable);
    List<DosingDeviceQueryDto> findAllLast(Pageable pageable);
}
