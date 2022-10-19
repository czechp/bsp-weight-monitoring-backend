package app.web.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
class Report {
    private final long id = 0L;
    private final String lineName = "";
    private final ReportSummary reportSummary;
    private final List<ReportDosingDeviceData> dosingDeviceFirstModule;
    private final List<ReportDosingDeviceData> dosingDeviceLastModule;
}
