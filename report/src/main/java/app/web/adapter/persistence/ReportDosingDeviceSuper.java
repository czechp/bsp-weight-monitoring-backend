package app.web.adapter.persistence;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass()
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
    @ManyToOne(fetch = FetchType.LAZY)
    private ReportEntity report;

    public ReportDosingDeviceSuper(long id, long version, int recordNumber, float totalMaterialWeight, float correctPercent, float averageWeight) {
        this.id = id;
        this.version = version;
        this.recordNumber = recordNumber;
        this.totalMaterialWeight = totalMaterialWeight;
        this.correctPercent = correctPercent;
        this.averageWeight = averageWeight;
    }
}
