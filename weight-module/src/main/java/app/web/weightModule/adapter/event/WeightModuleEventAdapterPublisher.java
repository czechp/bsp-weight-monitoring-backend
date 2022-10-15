package app.web.weightModule.adapter.event;

import app.web.weightModule.application.port.event.WeightModulePortEvent;
import app.web.weightModule.domain.WeightModule;
import app.web.weightModule.domain.WeightModuleAbstract;
import app.web.weightModule.event.WeightModuleCreateData;
import app.web.weightModule.event.WeightModuleCreateEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
class WeightModuleEventAdapterPublisher implements WeightModulePortEvent {
    private final ApplicationEventPublisher publisher;

    @Override
    public void notifyAboutModuleCreating(WeightModuleAbstract module, int dosingDeviceAmount) {
        WeightModuleCreateEvent event = new WeightModuleCreateEvent(this, new EventData(module, dosingDeviceAmount));
        publisher.publishEvent(event);
    }

    @AllArgsConstructor
    public class EventData implements WeightModuleCreateData{
        private final WeightModuleAbstract module;
        private final int dosingDeviceAmount;

        @Override
        public long getModuleId() {
            return module.getId();
        }

        @Override
        public String getLineName() {
            return module.getProductionLineName();
        }

        @Override
        public boolean isFirst() {
            return module instanceof WeightModule;
        }

        @Override
        public int getDosingDeviceAmount() {
            return dosingDeviceAmount;
        }
    }
}
