package app.web.weightModule.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter(value = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class ModuleStatusVO {
    private final int currentDosingDevice;
    private final float currentMeasure;
    private final boolean status;

     ModuleStatusVO() {
        this.currentDosingDevice = 0;
        this.currentMeasure = 0f;
        this.status = false;
    }
}
