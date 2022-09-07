package app.web.productionLine.adapter.persistence;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "production_lines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class ProductionLineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String lineName;

    @CreationTimestamp
    private LocalDateTime creationTimestamp;
}
