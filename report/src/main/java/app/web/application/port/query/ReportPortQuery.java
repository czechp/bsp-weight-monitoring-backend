package app.web.application.port.query;

import app.web.application.dto.ReportSimpleQueryDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReportPortQuery {
    List<ReportSimpleQueryDto> findAll(Pageable pageable);
}
