package app.web.report.dto;

public interface ReportSummary {
    String getLineName();
    long getTotalProductPcs();
    float getTotalMaterialWeight();
    float getWeightDifference();
    float getCorrectProductPercent();
    float getIncorrectProductPcs();
    long getOverFilledProductPcs();
    long getNotFulFilledProductPcs();
}
