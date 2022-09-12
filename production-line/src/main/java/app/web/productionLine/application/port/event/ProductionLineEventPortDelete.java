package app.web.productionLine.application.port.event;

public interface ProductionLineEventPortDelete {
    void emitDeleteEvent(long lineId, String lineName);
}
