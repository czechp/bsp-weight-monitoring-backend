package app.web.domain;

import java.time.LocalDate;
import java.util.List;

public class Report extends ReportSuper{
     Report(long id,
                  String lineName,
                  LocalDate reportDate,
                  WorkShift workShift,
                  ReportSummaryData reportSummaryData,
                  List<ReportDosingDeviceData> dosingDeviceFirstModule,
                  List<ReportDosingDeviceData> dosingDeviceLastModule) {
        super(id, lineName, reportDate, workShift, reportSummaryData, dosingDeviceFirstModule, dosingDeviceLastModule);
    }

     Report(String lineName,
                  WorkShift workShift,
                  ReportSummaryData reportSummaryData,
                  List<ReportDosingDeviceData> dosingDeviceFirstModule,
                  List<ReportDosingDeviceData> dosingDeviceLastModule) {
        super(lineName, workShift, reportSummaryData, dosingDeviceFirstModule, dosingDeviceLastModule);
    }
}
