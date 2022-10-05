package app.web.weightModule.adapter.persistence;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
abstract class WeightModuleSuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Version
    long version;

    @ManyToOne(fetch = FetchType.LAZY)
    protected ProductionLineSimpleEntity productionLineSimpleEntity;

    protected float productUpRangeWeight;
    protected float productDownRangeWeight;
    protected int currentDosingDevice;
    protected float currentMeasure;
    protected boolean status;
    protected float totalMaterialWeight;
    protected long totalProductPcs;
    protected float correctProductPercent;
}
