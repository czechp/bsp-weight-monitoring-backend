package app.web.weightModule.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeightModuleUpdateDto {
    private float productUpRangeWeight = 0f;
    private float productDownRangeWeight = 0f;
    private int currentDosingDevice = 0;
    private float currentMeasure = 0f;
    private boolean status = false;
    private float totalMaterialWeight = 0f;
    private long totalProductPcs = 0L;
    private float correctProductPercent = 0f;

}
