package app.web.adapter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "first_dosing_device")
@NoArgsConstructor
@Getter()
@Setter(AccessLevel.PACKAGE)
public class DosingDeviceFirstEntity extends DosingSuperEntity {
    public DosingDeviceFirstEntity(long id,
                                   long version,
                                   int recordNumber,
                                   int totalMaterial,
                                   float lastMeasure,
                                   int amountBelowMeasures,
                                   int amountCorrectMeasures,
                                   int amountAboveMeasures,
                                   float averageMeasure,
                                   float correctMeasurePercent,
                                   FirstModuleEntity firstModuleEntity) {
        super(id,
                version,
                recordNumber,
                totalMaterial,
                lastMeasure,
                amountBelowMeasures,
                amountCorrectMeasures,
                amountAboveMeasures,
                averageMeasure,
                correctMeasurePercent);
        this.firstModuleEntity = firstModuleEntity;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private FirstModuleEntity firstModuleEntity;
}
