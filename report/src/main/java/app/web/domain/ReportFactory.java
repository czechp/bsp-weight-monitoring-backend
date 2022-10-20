package app.web.domain;

import app.web.report.dto.ReportDosingDevice;
import app.web.report.dto.ReportSummary;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ReportFactory {
    static Report create(
            String lineName,
            LocalDate reportDate,
            WorkShift workShift,
            ReportSummary reportSummary,
            List<ReportDosingDevice> firstDosingDevices,
            List<ReportDosingDevice> lastDosingDevices
    ) {
        ReportSummaryData reportSummaryData = createReportSummary(reportSummary);
        List<ReportDosingDeviceData> firstDosingDevicesData = createDosingDevices(firstDosingDevices);
        List<ReportDosingDeviceData> lastDosingDevicesData = createDosingDevices(lastDosingDevices);
        return new Report(
                lineName,
                reportDate,
                workShift,
                reportSummaryData,
                firstDosingDevicesData,
                lastDosingDevicesData
        );
    }

    private static List<ReportDosingDeviceData> createDosingDevices(List<? extends ReportDosingDevice> reportDosingDevices) {
        return reportDosingDevices
                .stream()
                .map(n -> new ReportDosingDeviceData(n.getRecordNumber(), n.getTotalMaterial(), n.getCorrectPercent(), n.getAverageMeasure()))
                .collect(Collectors.toList());
    }

    private static ReportSummaryData createReportSummary(ReportSummary reportSummary) {
        return new ReportSummaryData(
                reportSummary.getTotalProductPcs(),
                reportSummary.getTotalMaterialWeight(),
                reportSummary.getWeightDifference(),
                reportSummary.getCorrectProductPercent(),
                reportSummary.getIncorrectProductPcs(),
                reportSummary.getOverFilledProductPcs(),
                reportSummary.getNotFulFilledProductPcs()
        );
    }
}
