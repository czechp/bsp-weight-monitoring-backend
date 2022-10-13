package app.web.adapter;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "first_dosing_device")
@NoArgsConstructor
public class DosingDeviceFirstEntity extends DosingSuperEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private FirstModuleEntity firstModuleEntity;
}
