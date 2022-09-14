package app.web.weightModule.adapter.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "weight_modules")
@Getter
@Setter
@NoArgsConstructor
public
class WeightModuleEntity extends WeightModuleSuperEntity {
    public WeightModuleEntity(long id,
                              ProductionLineSimpleEntity productionLineSimpleEntity,
                              float productUpRangeWeight,
                              float productDownRangeWeight,
                              int currentDosingDevice,
                              float currentWeight,
                              boolean status,
                              float totalMaterialWeight,
                              long totalProductPcs,
                              float correctProductPercent) {
        super(id,
                productionLineSimpleEntity,
                productUpRangeWeight,
                productDownRangeWeight,
                currentDosingDevice,
                currentWeight,
                status,
                totalMaterialWeight,
                totalProductPcs,
                correctProductPercent);
    }
}
