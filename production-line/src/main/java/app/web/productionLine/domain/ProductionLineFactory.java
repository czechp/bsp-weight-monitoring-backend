package app.web.productionLine.domain;

import app.web.productionLine.adapter.persistence.ProductionLineEntity;
import app.web.productionLine.application.dto.ProductionLineQueryDto;

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

    public static ProductionLine toDomain(ProductionLineEntity productionLineEntity) {
        return new ProductionLine(productionLineEntity.getId(),
                productionLineEntity.getLineName(),
                productionLineEntity.getCreationTimestamp());
    }

    public static ProductionLineQueryDto toDto(ProductionLineEntity productionLineEntity) {
        return new ProductionLineQueryDto(productionLineEntity.getId(),
                productionLineEntity.getLineName(),
                productionLineEntity.getCreationTimestamp());

    }
}
