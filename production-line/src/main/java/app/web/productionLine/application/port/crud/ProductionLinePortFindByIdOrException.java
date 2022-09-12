package app.web.productionLine.application.port.crud;

import app.web.productionLine.domain.ProductionLine;

import java.util.Optional;

public interface ProductionLinePortFindByIdOrException {
    ProductionLine findProductionLineByIdOrException(long lineId);
}
