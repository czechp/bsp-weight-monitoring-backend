package app.web.domain;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
abstract class ReportSuper {
    private final long id;
    private final String lineName;
    private final WorkShift workShift;
    private final ReportSummary reportSummary;
    private final List<ReportDosingDeviceData> dosingDeviceFirstModule;
    private final List<ReportDosingDeviceData> dosingDeviceLastModule;


}
