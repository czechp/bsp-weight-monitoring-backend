package app.web.productionLine.adapter.persistence;

import app.web.productionLine.application.port.crud.ProductionLinePortSave;
import app.web.productionLine.domain.ProductionLine;
import app.web.productionLine.domain.ProductionLineFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class ProductionLinePersistenceAdapter implements ProductionLinePortSave {
    private final ProductionLineRepository productionLineRepository;

    @Override
    public ProductionLine saveProductionLine(ProductionLine productionLine) {
        final var productionLineEntity = ProductionLineFactory.toEntity(productionLine);
        return ProductionLineFactory.toDomain(productionLineRepository.save(productionLineEntity));
    }
}
