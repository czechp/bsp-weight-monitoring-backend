package app.web.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
class Measures {
    protected float lastMeasure;
    protected int amountBelowMeasures;
    protected int amountCorrectMeasures;
    protected int amountAboveMeasures;
    protected float averageMeasure;
    protected float correctMeasurePercent;

}
