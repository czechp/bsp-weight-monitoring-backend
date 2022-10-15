package app.web.domain;

import lombok.AccessLevel;
import lombok.Getter;

@Getter(AccessLevel.PACKAGE)
public abstract class DosingDevice {
    protected long id;
    protected long version;
    protected ModuleInfo moduleInfo;
    protected ModuleType moduleType;
    protected int recordNumber;
    protected int totalMaterial;
    protected Measures measures = new Measures();

    DosingDevice(long id, long version, ModuleInfo moduleInfo, int recordNumber, int totalMaterial, Measures measures) {
        this.id = id;
        this.version = version;
        this.recordNumber = recordNumber;
        this.totalMaterial = totalMaterial;
        this.measures = measures;
        this.moduleInfo = moduleInfo;
        this.moduleType = setModuleType();
    }

    DosingDevice(ModuleInfo moduleInfo, int recordNumber ){
        this.moduleInfo = moduleInfo;
        this.recordNumber = recordNumber;
        this.moduleType = setModuleType();
    }

    abstract ModuleType setModuleType();
}
