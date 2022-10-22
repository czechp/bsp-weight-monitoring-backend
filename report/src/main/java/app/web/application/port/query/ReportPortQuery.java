package app.web.application.port.query;

import app.web.application.dto.ReportQueryDto;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ReportPortQuery {
    List<ReportQueryDto> findAll(Pageable pageable);
    Optional<ReportQueryDto> findById(long id);

}
