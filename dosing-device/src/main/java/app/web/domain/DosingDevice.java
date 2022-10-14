package app.web.domain;

abstract class DosingDevice {
    protected long id;
    protected long version;
    protected String lineName;
    protected ModuleType moduleType;
    protected int recordNumber;
    protected int totalMaterial;
    protected Measures measures;

    public DosingDevice(long id, long version, String lineName, ModuleType moduleType, int recordNumber, int totalMaterial, Measures measures) {
        this.id = id;
        this.version = version;
        this.lineName = lineName;
        this.moduleType = moduleType;
        this.recordNumber = recordNumber;
        this.totalMaterial = totalMaterial;
        this.measures = measures;
    }

    abstract ModuleType setModuleType();
}
