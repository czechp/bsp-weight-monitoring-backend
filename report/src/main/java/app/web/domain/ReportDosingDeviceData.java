package app.web.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
class ReportDosingDeviceData {
    private final int recordNumber;
    private final int totalMaterialWeight;
    private final float correctPercent;
    private final float averageWeight;
}
