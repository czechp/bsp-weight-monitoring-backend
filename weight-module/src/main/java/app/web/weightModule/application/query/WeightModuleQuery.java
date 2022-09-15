package app.web.weightModule.application.query;

import app.web.weightModule.application.dto.WeightModuleQueryDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

interface WeightModuleQuery {
    List<WeightModuleQueryDto> findAllWeightModule(Pageable pageable);
}
