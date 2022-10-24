package app.web.application.useCase;

import app.web.domain.Report;
import app.web.domain.WorkShift;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
class ReportUseCaseCreateImpl implements ReportUseCaseCreate{

    @Override
    public List<Report> createForAllLines(WorkShift workShift) {
        return null;
    }
}
