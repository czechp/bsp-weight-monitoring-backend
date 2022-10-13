package app.web.domain;

abstract class Module {
    protected long moduleId;
    private String lineName;
    protected ModuleType moduleType;

    public Module(long moduleId, String lineName) {
        this.moduleId = moduleId;
        this.lineName = lineName;
        this.moduleType = chooseModuleType();
    }

    abstract ModuleType chooseModuleType();
}
