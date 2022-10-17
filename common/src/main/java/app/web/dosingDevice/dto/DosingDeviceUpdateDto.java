package app.web.dosingDevice.dto;

public interface DosingDeviceUpdateDto {
    float getLastMeasure();
    int getAmountBelowMeasures();
    int getAmountCorrectMeasures();
    int getAmountAboveMeasures();
    float getAverageMeasure();
    int getCorrectMeasuresPercent();
    int getTotalMaterial();
}
