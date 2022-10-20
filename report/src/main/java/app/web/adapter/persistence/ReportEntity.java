package app.web.adapter.persistence;

import app.web.domain.WorkShift;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reports")
@AllArgsConstructor
@NoArgsConstructor
@Getter()
@Setter(AccessLevel.PACKAGE)
public class ReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private long version;
    private LocalDate reportDate;
    @Enumerated(EnumType.STRING)
    private WorkShift workShift;
    private  long totalProductPcs;
    private  float totalMaterialWeight;
    private  float weightDifference;
    private  float correctProductPercent;
    private  long incorrectProductPcs;
    private  long overFilledProductPcs;
    private  long notRefilledProductPcs;
}
