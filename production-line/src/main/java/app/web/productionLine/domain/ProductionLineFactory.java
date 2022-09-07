package app.web.productionLine.domain;

public class ProductionLineFactory {
    static ProductionLine create(String lineName){
        return new ProductionLine(lineName);
    }
}
