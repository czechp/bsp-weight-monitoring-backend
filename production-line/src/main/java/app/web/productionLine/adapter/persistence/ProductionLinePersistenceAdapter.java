package app.web.productionLine.adapter.persistence;

import app.web.productionLine.application.port.crud.ProductionLinePortDeleteById;
import app.web.productionLine.application.port.crud.ProductionLinePortFindById;
import app.web.productionLine.application.port.crud.ProductionLinePortSave;
import app.web.productionLine.domain.ProductionLine;
import app.web.productionLine.domain.ProductionLineFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
class ProductionLinePersistenceAdapter implements ProductionLinePortSave,
        ProductionLinePortFindById,
        ProductionLinePortDeleteById {
    private final ProductionLineRepository productionLineRepository;

    @Override
    public ProductionLine saveProductionLine(ProductionLine productionLine) {
        final var productionLineEntity = ProductionLineFactory.toEntity(productionLine);
        return ProductionLineFactory.toDomain(productionLineRepository.save(productionLineEntity));
    }

    @Override
    public Optional<ProductionLine> findProductionLineById(long lineId) {
        return productionLineRepository.findById(lineId)
                .map(ProductionLineFactory::toDomain);
    }

    @Override
    public void deleteProductionLineById(long id) {
        productionLineRepository.deleteById(id);
    }
}
