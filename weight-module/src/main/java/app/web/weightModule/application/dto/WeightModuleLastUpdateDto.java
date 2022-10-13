package app.web.weightModule.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public
class WeightModuleLastUpdateDto {
    private long incorrectProductPcs;
    private float weightDifference;
    private float correctToOverdosePercent;
    private long notRefilledProductPcs;
    private long overFilledProductPcs;
    private float overFilledToNotRefilledPercent;
}
