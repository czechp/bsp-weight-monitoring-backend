package app.web.weightModule.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(value = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
class ModuleStatusVO {
    private final int currentDosingDevice;
    private final float currentMeasure;
    private final boolean status;

    public ModuleStatusVO(int currentDosingDevice, float currentMeasure, boolean status) {
        this.currentDosingDevice = currentDosingDevice;
        this.currentMeasure = currentMeasure;
        this.status = status;
    }
}
