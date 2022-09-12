package app.web.productionLine.application.useCase;

import app.web.productionLine.application.port.crud.ProductionLinePortFindById;
import app.web.productionLine.domain.ProductionLineTestCasesProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
class ProductionLineUseCaseDeleteTest {
    @Mock
    ProductionLinePortFindById productionLinePortFindById;
    @Mock
    ProductionLinePortDeleteById productionLinePortDeleteById;

    ProductionLineUseCaseDelete productionLineUseCaseDelete;

    @Test
    void deleteProductionLineByIdTest() {
        //given
        final var productionLineId = 1L;
        //when
        Mockito.when(productionLinePortFindById.findProductionLineById(anyLong())).thenReturn(Optional.of(ProductionLineTestCasesProvider.getProductionLineToDelete()));
        final var deletedProductionLine = productionLineUseCaseDelete.deleteById(productionLineId);
        //then
        Mockito.verify(productionLinePortDeleteById.deleteProductionLineById(anyLong()));
    }
}
