package app.web.weightModule.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeightModuleCreateDto {
    private long productionLineId;
    @Min(1)
    private int dosingDeviceAmount;
}
