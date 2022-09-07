package app.web.productionLine.adapter.persistence;

import app.web.productionLine.domain.ProductionLineFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductionLineEntityTest {

    @Test
    void mapFromDomainTest(){
        //given
        final var lineName = "Some new line";
        final var productionLine = ProductionLineFactory.create(lineName);
        //when
        final var productionLineEntity = ProductionLineFactory.toEntity(productionLine);
        //then
        assertEquals(lineName, productionLineEntity.getLineName());
    }
}