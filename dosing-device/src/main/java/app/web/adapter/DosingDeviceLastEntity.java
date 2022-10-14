package app.web.adapter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "last_dosing_device")
@NoArgsConstructor
@Getter()
@Setter(AccessLevel.PACKAGE)
public class DosingDeviceLastEntity extends DosingSuperEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private LastModuleEntity lastModuleEntity;

    public DosingDeviceLastEntity(long id,
                                  long version,
                                  String lineName,
                                  int recordNumber,
                                  int totalMaterial,
                                  float lastMeasure,
                                  int amountBelowMeasures,
                                  int amountCorrectMeasures,
                                  int amountAboveMeasures,
                                  float averageMeasure,
                                  float correctMeasurePercent,
                                  LastModuleEntity lastModuleEntity) {
        super(id,
                version,
                lineName,
                recordNumber,
                totalMaterial,
                lastMeasure,
                amountBelowMeasures,
                amountCorrectMeasures,
                amountAboveMeasures,
                averageMeasure,
                correctMeasurePercent);
        this.lastModuleEntity = lastModuleEntity;
    }
}
