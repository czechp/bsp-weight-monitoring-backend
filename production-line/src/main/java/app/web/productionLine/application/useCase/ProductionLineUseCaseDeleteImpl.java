package app.web.productionLine.application.useCase;

import app.web.productionLine.application.port.crud.ProductionLinePortDeleteById;
import app.web.productionLine.application.port.crud.ProductionLinePortFindByIdOrException;
import app.web.productionLine.application.port.event.ProductionLineEventPortDelete;
import app.web.productionLine.domain.ProductionLine;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
class ProductionLineUseCaseDeleteImpl implements ProductionLineUseCaseDeleteById {
    private ProductionLinePortFindByIdOrException portFindById;
    private ProductionLinePortDeleteById portDeleteById;
    private ProductionLineEventPortDelete eventPortDelete;

    @Override
    @Transactional
    public ProductionLine deleteById(long id) {
        ProductionLine productionLine = portFindById.findProductionLineByIdOrException(id);
        portDeleteById.deleteProductionLineById(productionLine.getId());
        eventPortDelete.emitDeleteEvent(productionLine.getId(), productionLine.getLineName());
        return productionLine;
    }
}
