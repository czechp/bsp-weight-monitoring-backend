package app.web.domain;

class DosingDeviceFirst extends DosingDevice {
    public DosingDeviceFirst(long id, long version, String lineName, ModuleType moduleType, int recordNumber, int totalMaterial, Measures measures) {
        super(id, version, lineName, moduleType, recordNumber, totalMaterial, measures);
    }

    @Override
    ModuleType setModuleType() {
        return ModuleType.FIRST;
    }
}
