package app.web.domain;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
abstract class ReportSuper {
    private final long id;
    private final String lineName;
    private final LocalDate reportDate;
    private final WorkShift workShift;
    private final ReportSummaryData reportSummaryData;
    private final List<ReportDosingDeviceData> dosingDeviceFirstModule;
    private final List<ReportDosingDeviceData> dosingDeviceLastModule;

    public ReportSuper(String lineName,
                       LocalDate reportDate,
                       WorkShift workShift,
                       ReportSummaryData reportSummaryData,
                       List<ReportDosingDeviceData> dosingDeviceFirstModule,
                       List<ReportDosingDeviceData> dosingDeviceLastModule) {
        this.id = 0L;
        this.lineName = lineName;
        this.reportDate = reportDate;
        this.workShift = workShift;
        this.reportSummaryData = reportSummaryData;
        this.dosingDeviceFirstModule = dosingDeviceFirstModule;
        this.dosingDeviceLastModule = dosingDeviceLastModule;
    }
}
