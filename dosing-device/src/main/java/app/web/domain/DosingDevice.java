package app.web.domain;

abstract class DosingDevice {
    protected long id;
    protected long version;
    protected int recordNumber;
    protected float lastMeasure;
    protected int amountBelowMeasures;
    protected int amountCorrectMeasures;
    protected int amountAboveMeasures;
    protected float averageMeasure;
    protected float correctMeasurePercent;
    protected int totalMaterial;

    public DosingDevice(long id,
                        long version,
                        int recordNumber,
                        float lastMeasure,
                        int amountBelowMeasures,
                        int amountCorrectMeasures,
                        int amountAboveMeasures,
                        float averageMeasure,
                        float correctMeasurePercent,
                        int totalMaterial) {
        this.id = id;
        this.version = version;
        this.recordNumber = recordNumber;
        this.lastMeasure = lastMeasure;
        this.amountBelowMeasures = amountBelowMeasures;
        this.amountCorrectMeasures = amountCorrectMeasures;
        this.amountAboveMeasures = amountAboveMeasures;
        this.averageMeasure = averageMeasure;
        this.correctMeasurePercent = correctMeasurePercent;
        this.totalMaterial = totalMaterial;
    }
}
