package app.web.productionLine.application.useCase;

import app.web.productionLine.application.port.crud.ProductionLinePortDeleteById;
import app.web.productionLine.application.port.crud.ProductionLinePortFindByIdOrException;
import app.web.productionLine.application.port.event.ProductionLineEventPortDelete;
import app.web.productionLine.domain.ProductionLine;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class ProductionLineUseCaseDeleteImpl implements ProductionLineUseCaseDeleteById {
    private ProductionLinePortFindByIdOrException productionLinePortFindByIdOrException;
    private ProductionLinePortDeleteById productionLinePortDeleteById;
    private ProductionLineEventPortDelete eventPortDelete;

    @Override
    public ProductionLine deleteById(long id) {
        return null;
    }
}
