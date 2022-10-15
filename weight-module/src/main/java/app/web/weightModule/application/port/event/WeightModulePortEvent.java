package app.web.weightModule.application.port.event;

import app.web.weightModule.domain.WeightModuleAbstract;
import app.web.weightModule.event.WeightModuleCreateData;

public interface WeightModulePortEvent {
    void notifyAboutModuleCreating(WeightModuleAbstract weightModuleAbstract, int dosingDeviceAmount);
}
