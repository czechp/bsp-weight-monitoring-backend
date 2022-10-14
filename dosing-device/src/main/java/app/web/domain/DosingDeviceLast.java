package app.web.domain;

class DosingDeviceLast extends DosingDevice {
    public DosingDeviceLast(long id, long version, String lineName, ModuleType moduleType, int recordNumber, int totalMaterial, Measures measures) {
        super(id, version, lineName, moduleType, recordNumber, totalMaterial, measures);
    }

    @Override
    ModuleType setModuleType() {
        return ModuleType.LAST;
    }
}
