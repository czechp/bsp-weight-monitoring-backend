package app.web.productionLine.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter()
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ProductionLine {
    private long id;
    private String lineName;
    private LocalDateTime creationTimestamp;

    ProductionLine(String lineName) {
        this.lineName = lineName;
    }

}
