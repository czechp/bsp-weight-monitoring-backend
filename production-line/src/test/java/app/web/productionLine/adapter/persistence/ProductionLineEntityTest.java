package app.web.productionLine.adapter.persistence;

import app.web.productionLine.domain.ProductionLine;
import app.web.productionLine.domain.ProductionLineFactory;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductionLineEntityTest {

    @Test
    void mapFromDomainTest() {
        //given
        final var lineName = "Some new line";
        final var productionLine = ProductionLineFactory.create(lineName);
        //when
        final var productionLineEntity = ProductionLineFactory.toEntity(productionLine);
        //then
        assertEquals(productionLine.getLineName(), productionLineEntity.getLineName());
        assertEquals(productionLine.getId(), productionLineEntity.getId());
    }

    @Test
    void mapToDomainTest() {
        //given
        final var productionLineEntity = ProductionLineEntity.builder()
                .withId(1L)
                .withLineName("Some line name")
                .withCreationTimestamp(LocalDateTime.now())
                .build();
        //when
        final ProductionLine productionLine = ProductionLineFactory.toDomain(productionLineEntity);
        //then
        assertEquals(productionLineEntity.getId(), productionLine.getId());
        assertEquals(productionLineEntity.getLineName(), productionLine.getLineName());
        assertEquals(productionLineEntity.getCreationTimestamp(), productionLine.getCreationTimestamp());
    }
}