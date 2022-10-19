package app.web.report.dto;

public interface ReportSummary {
    float getTotalMaterialWeight();
    float getWeightDifference();
    float getCorrectProductPercent();
    float getIncorrectProductPcs();
    long getOverFilledProductPcs();
    long getNotFulFilledProductPcs();
}
