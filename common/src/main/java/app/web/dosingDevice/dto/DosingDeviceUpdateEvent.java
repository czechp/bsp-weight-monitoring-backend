package app.web.dosingDevice.dto;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.util.List;

@Getter
public class DosingDeviceUpdateEvent extends ApplicationEvent {
    private long moduleId;
    private List<DosingDeviceUpdateData> updateDtoList;
    private boolean isFirst;


    public DosingDeviceUpdateEvent(Object source, long moduleId, List<DosingDeviceUpdateData> updateDtoList, boolean isFirst) {
        super(source);
        this.moduleId = moduleId;
        this.updateDtoList = updateDtoList;
        this.isFirst = isFirst;
    }
}
