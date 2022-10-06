package app.web.weightModule.adapter.rest;

import app.web.weightModule.application.dto.WeightModuleLastQueryDto;
import app.web.weightModule.application.query.WeightModuleLastQuery;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weight-modules-last")
@CrossOrigin("*")
@AllArgsConstructor
class WeightModuleLastRestAdapterQuery {
    private final WeightModuleLastQuery query;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<WeightModuleLastQueryDto> findAllWeightModulesAll(Pageable pageable) {
        return query.findAllWeightModuleLast(pageable);
    }
}
