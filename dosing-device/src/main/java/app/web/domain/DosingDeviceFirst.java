package app.web.domain;

import lombok.AccessLevel;
import lombok.Getter;

public class DosingDeviceFirst extends DosingDevice {
    public DosingDeviceFirst(long id, long version, ModuleInfo moduleInfo, String lineName, int recordNumber, int totalMaterial, Measures measures) {
        super(id, version, moduleInfo, recordNumber, totalMaterial, measures);
    }

    @Override
    ModuleType setModuleType() {
        return ModuleType.FIRST;
    }
}
