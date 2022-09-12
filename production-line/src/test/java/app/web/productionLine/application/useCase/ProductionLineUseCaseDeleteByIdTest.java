package app.web.productionLine.application.useCase;

import app.web.productionLine.application.port.crud.ProductionLinePortDeleteById;
import app.web.productionLine.application.port.crud.ProductionLinePortFindByIdOrException;
import app.web.productionLine.application.port.event.ProductionLineEventPortDelete;
import app.web.productionLine.domain.ProductionLineTestCasesProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
class ProductionLineUseCaseDeleteByIdTest {
    @Mock
    ProductionLinePortFindByIdOrException productionLinePortFindByIdOrException;
    @Mock
    ProductionLinePortDeleteById productionLinePortDeleteById;
    @Mock
    ProductionLineEventPortDelete productionLineEventPortDelete;

    ProductionLineUseCaseDeleteById productionLineUseCaseDeleteById;

    @BeforeEach
    void init() {
        this.productionLineUseCaseDeleteById = new ProductionLineUseCaseDeleteImpl(
                productionLinePortFindByIdOrException,
                productionLinePortDeleteById,
                productionLineEventPortDelete
        );
    }

    @Test
    void deleteProductionLineByIdTest() {
        //given
        final var productionLineId = 1L;
        //when
        Mockito.when(productionLinePortFindByIdOrException.findProductionLineByIdOrException(anyLong())).thenReturn(Optional.of(ProductionLineTestCasesProvider.getProductionLineToDelete()));
        final var deletedProductionLine = productionLineUseCaseDeleteById.deleteById(productionLineId);
        //then
        Mockito.verify(productionLinePortDeleteById, Mockito.times(1))
                .deleteProductionLineById(anyLong());
        Mockito.verify(productionLineEventPortDelete, Mockito.timeout(1)).emitDeleteEvent(anyLong(), anyString());
    }
}
