package app.web.domain;

class FirstModule extends Module{
    public FirstModule(long moduleId, String lineName) {
        super(moduleId, lineName);
    }

    @Override
    ModuleType chooseModuleType() {
        return ModuleType.FIRST;
    }
}
