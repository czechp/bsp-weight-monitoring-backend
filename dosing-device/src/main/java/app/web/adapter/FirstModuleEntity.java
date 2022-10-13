package app.web.adapter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="weight_modules")
@Getter
@Setter(AccessLevel.PACKAGE)
public class FirstModuleEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String productionLineSimpleEntity_lineName;
}
