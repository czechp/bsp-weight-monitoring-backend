package app.web.weightModule.adapter.rest;

import app.web.weightModule.application.dto.WeightModuleQueryDto;
import app.web.weightModule.application.query.WeightModuleQuery;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weight-modules")
@CrossOrigin("*")
@AllArgsConstructor
class WeightModuleRestAdapterQuery {
    private final WeightModuleQuery weightModuleQuery;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<WeightModuleQueryDto> findAllWeightModules(Pageable pageable) {
        return weightModuleQuery.findAllWeightModule(pageable);
    }
}
