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
}
