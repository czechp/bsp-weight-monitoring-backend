package app.web.domain;

import java.time.LocalDate;
import java.util.List;

class Report extends ReportSuper{
    public Report(long id,
                  String lineName,
                  LocalDate reportDate,
                  WorkShift workShift,
                  ReportSummaryData reportSummaryData,
                  List<ReportDosingDeviceData> dosingDeviceFirstModule,
                  List<ReportDosingDeviceData> dosingDeviceLastModule) {
        super(id, lineName, reportDate, workShift, reportSummaryData, dosingDeviceFirstModule, dosingDeviceLastModule);
    }

    public Report(String lineName,
                  LocalDate localDate,
                  WorkShift workShift,
                  ReportSummaryData reportSummaryData,
                  List<ReportDosingDeviceData> dosingDeviceFirstModule,
                  List<ReportDosingDeviceData> dosingDeviceLastModule) {
        super(lineName, localDate, workShift, reportSummaryData, dosingDeviceFirstModule, dosingDeviceLastModule);
    }
}
