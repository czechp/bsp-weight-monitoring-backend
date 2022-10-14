package app.web.domain;

class DosingDeviceLast extends DosingDevice {
    public DosingDeviceLast(long id, long version, ModuleInfo moduleInfo, int recordNumber, int totalMaterial, Measures measures) {
        super(id, version, moduleInfo, recordNumber, totalMaterial, measures);
    }

    @Override
    ModuleType setModuleType() {
        return ModuleType.LAST;
    }
}
