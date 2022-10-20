package app.web.application.query;

import app.web.application.dto.ReportSimpleQueryDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReportQuery {
    List<ReportSimpleQueryDto> findAll(Pageable pageable);
}
