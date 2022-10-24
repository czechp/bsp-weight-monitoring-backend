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
                       WorkShift workShift,
                       ReportSummaryData reportSummaryData,
                       List<ReportDosingDeviceData> dosingDeviceFirstModule,
                       List<ReportDosingDeviceData> dosingDeviceLastModule) {
        this.id = 0L;
        this.lineName = lineName;
        this.reportDate = workShift == WorkShift.III ? LocalDate.now().minusDays(1) : LocalDate.now();
        this.workShift = workShift;
        this.reportSummaryData = reportSummaryData;
        this.dosingDeviceFirstModule = dosingDeviceFirstModule;
        this.dosingDeviceLastModule = dosingDeviceLastModule;
    }


    public boolean isNotEmpty() {
        return this.reportSummaryData.getTotalProductPcs() != 0;
    }
}
