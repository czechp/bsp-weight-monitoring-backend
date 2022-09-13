package app.web.productionLine.event;

import org.springframework.context.ApplicationEvent;

public class ProductionLineEventDelete extends ApplicationEvent {
    private long lineId;
    private String lineName;

    public ProductionLineEventDelete(Object source, long lineId, String lineName) {
        super(source);
        this.lineId = lineId;
        this.lineName = lineName;
    }

}
