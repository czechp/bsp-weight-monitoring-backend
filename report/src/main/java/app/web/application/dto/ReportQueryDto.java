package app.web.application.dto;

import app.web.domain.WorkShift;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class ReportQueryDto extends ReportSimpleQueryDto {
    private final List<ReportDosingDeviceDto> firstDosingDevices;
    private final List<ReportDosingDeviceDto> lastDosingDevices;

    public ReportQueryDto(long id,
                          LocalDate reportDate,
                          String lineName,
                          WorkShift workShift,
                          long totalProductPcs,
                          float totalMaterialWeight,
                          float weightDifference,
                          float correctProductPercent,
                          long incorrectProductPcs,
                          long overFilledProductPcs,
                          long notRefilledProductPcs,
                          List<ReportDosingDeviceDto> firstDosingDevices,
                          List<ReportDosingDeviceDto> lastDosingDevices) {
        super(id, reportDate, lineName, workShift, totalProductPcs, totalMaterialWeight, weightDifference, correctProductPercent, incorrectProductPcs, overFilledProductPcs, notRefilledProductPcs);
        this.firstDosingDevices = firstDosingDevices;
        this.lastDosingDevices = lastDosingDevices;
    }

    @AllArgsConstructor
    @Data
    public static class ReportDosingDeviceDto{
        private final long id;
        private final int recordNumber;
        private final float totalMaterialWeight;
        private final float correctPercent;
        private final float averageWeight;
    }
}


