package app.web.productionLine.domain;

import app.web.productionLine.adapter.persistence.ProductionLineEntity;

public class ProductionLineFactory {
    public static ProductionLine create(String lineName) {
        return new ProductionLine(lineName);
    }

    public static ProductionLineEntity toEntity(ProductionLine productionLine) {
        return new ProductionLineEntity(
                productionLine.getId(),
                productionLine.getLineName(),
                productionLine.getCreationTimestamp()
        );
    }
}
