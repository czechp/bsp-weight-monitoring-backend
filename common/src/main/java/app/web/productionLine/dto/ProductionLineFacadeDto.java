package app.web.productionLine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ProductionLineFacadeDto {
    private final long productionLineId;
    private final String productionLineName;

    public ProductionLineFacadeDto() {
        this.productionLineId = 0l;
        this.productionLineName = "";
    }
}
