package app.web.adapter.persistence;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass()
@AllArgsConstructor
@Getter
@Setter(AccessLevel.PACKAGE)
abstract class ReportDosingDeviceSuper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private long version;
    private final int recordNumber;
    private final float totalMaterialWeight;
    private final float correctPercent;
    private final float averageWeight;
}
