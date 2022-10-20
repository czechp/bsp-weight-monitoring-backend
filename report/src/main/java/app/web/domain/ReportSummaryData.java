package app.web.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
class ReportSummaryData {
    private final long totalProductPcs;
    private final float totalMaterialWeight;
    private final float weightDifference;
    private final float correctProductPercent;
    private final long incorrectProductPcs;
    private final long overFilledProductPcs;
    private final long notRefilledProductPcs;
}
