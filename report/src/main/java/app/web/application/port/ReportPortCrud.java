package app.web.application.port;

import app.web.domain.Report;

public interface ReportPortCrud {
    void removeById(long reportId);
}
