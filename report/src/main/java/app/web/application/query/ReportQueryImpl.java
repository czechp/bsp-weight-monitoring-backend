package app.web.application.query;

import app.web.application.dto.ReportSimpleQueryDto;
import app.web.application.port.query.ReportPortQuery;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
class ReportQueryImpl implements ReportQuery{
    private final ReportPortQuery reportPortQuery;
    @Override
    public List<ReportSimpleQueryDto> findAll(Pageable pageable) {
        return reportPortQuery.findAll(pageable);
    }
}
