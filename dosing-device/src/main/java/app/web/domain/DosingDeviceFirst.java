package app.web.domain;

class DosingDeviceFirst extends DosingDevice {
    public DosingDeviceFirst(long id, long version, ModuleType moduleType, int recordNumber, int totalMaterial, Measures measures) {
        super(id, version, moduleType, recordNumber, totalMaterial, measures);
    }

    @Override
    ModuleType setModuleType() {
        return ModuleType.FIRST;
    }
}
