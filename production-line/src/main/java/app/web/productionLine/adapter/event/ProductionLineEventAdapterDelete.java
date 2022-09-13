package app.web.productionLine.adapter.event;

import app.web.productionLine.application.port.event.ProductionLineEventPortDelete;
import app.web.productionLine.event.ProductionLineEventDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
class ProductionLineEventAdapterDelete implements ProductionLineEventPortDelete {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void emitDeleteEvent(long lineId, String lineName) {
        final var deleteEvent = new ProductionLineEventDelete(this, lineId, lineName);
        applicationEventPublisher.publishEvent(deleteEvent);
    }
}
