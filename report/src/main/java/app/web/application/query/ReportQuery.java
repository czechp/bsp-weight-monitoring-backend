package app.web.application.query;

import app.web.application.dto.ReportQueryDto;
import app.web.application.dto.ReportSimpleQueryDto;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ReportQuery {
    List<ReportSimpleQueryDto> findAll(Pageable pageable);
    Optional<ReportQueryDto> findById(long id);
}
