package app.web.application.useCase;

import app.web.domain.Report;

public interface ReportUseCaseRemove {
    Report removeById(long reportId);
}
