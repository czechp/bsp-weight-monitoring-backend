package app.web.domain;

class DosingDeviceLast extends DosingDevice{
    public DosingDeviceLast(long id, long version, ModuleType moduleType, int recordNumber, int totalMaterial, Measures measures) {
        super(id, version, moduleType, recordNumber, totalMaterial, measures);
    }

    @Override
    ModuleType setModuleType() {
        return ModuleType.LAST;
    }
}
