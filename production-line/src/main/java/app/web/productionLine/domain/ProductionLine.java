package app.web.productionLine.domain;

import lombok.AccessLevel;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter(value = AccessLevel.PACKAGE)
class ProductionLine {
    private long id;
    private String lineName;
    private LocalDateTime creationTimestamp;

    ProductionLine(String lineName) {
        this.lineName = lineName;
    }
}
