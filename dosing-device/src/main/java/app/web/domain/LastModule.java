package app.web.domain;

class LastModule extends Module{
    public LastModule(long moduleId, String lineName) {
        super(moduleId, lineName);
    }

    @Override
    ModuleType chooseModuleType() {
        return ModuleType.LAST;
    }
}
