package app.web.domain;

import app.web.adapter.persistence.ReportDosingDeviceFirstEntity;
import app.web.adapter.persistence.ReportDosingDeviceLastEntity;
import app.web.adapter.persistence.ReportEntity;
import app.web.application.dto.ReportQueryDto;
import app.web.application.dto.ReportSimpleQueryDto;
import app.web.report.dto.ReportDosingDevice;
import app.web.report.dto.ReportSummary;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ReportFactory {
    static Report create(
            String lineName,
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
                workShift,
                reportSummaryData,
                firstDosingDevicesData,
                lastDosingDevicesData
        );
    }

    public static ReportSimpleQueryDto toSimpleDto(ReportEntity entity) {
        return new ReportSimpleQueryDto(
                entity.getId(),
                entity.getReportDate(),
                entity.getLineName(),
                entity.getWorkShift(),
                entity.getTotalProductPcs(),
                entity.getTotalMaterialWeight(),
                entity.getWeightDifference(),
                entity.getCorrectProductPercent(),
                entity.getIncorrectProductPcs(),
                entity.getOverFilledProductPcs(),
                entity.getNotRefilledProductPcs()
        );
    }

    public static ReportQueryDto toDto(ReportEntity entity) {
        List<ReportQueryDto.ReportDosingDeviceDto> firstDosingDevices = createFirstDosingDevicesDto(entity.getFirstDosingDevices());
        List<ReportQueryDto.ReportDosingDeviceDto> lastDosingDevices = createLastDosingDevicesDto(entity.getLastDosingDevices());

        return new ReportQueryDto(entity.getId(),
                entity.getReportDate(),
                entity.getLineName(),
                entity.getWorkShift(),
                entity.getTotalProductPcs(),
                entity.getTotalMaterialWeight(),
                entity.getWeightDifference(),
                entity.getCorrectProductPercent(),
                entity.getIncorrectProductPcs(),
                entity.getOverFilledProductPcs(),
                entity.getNotRefilledProductPcs(),
                firstDosingDevices,
                lastDosingDevices
        );
    }

    private static List<ReportQueryDto.ReportDosingDeviceDto> createFirstDosingDevicesDto(List<ReportDosingDeviceFirstEntity> entities) {
        return entities
                .stream()
                .map(dosingDevice -> new ReportQueryDto.ReportDosingDeviceDto(dosingDevice.getId(),
                        dosingDevice.getRecordNumber(),
                        dosingDevice.getTotalMaterialWeight(),
                        dosingDevice.getCorrectPercent(),
                        dosingDevice.getAverageWeight()))
                .collect(Collectors.toList());
    }
    private static List<ReportQueryDto.ReportDosingDeviceDto> createLastDosingDevicesDto(List<ReportDosingDeviceLastEntity> entities) {
        return entities
                .stream()
                .map(dosingDevice -> new ReportQueryDto.ReportDosingDeviceDto(dosingDevice.getId(),
                        dosingDevice.getRecordNumber(),
                        dosingDevice.getTotalMaterialWeight(),
                        dosingDevice.getCorrectPercent(),
                        dosingDevice.getAverageWeight()))
                .collect(Collectors.toList());
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
