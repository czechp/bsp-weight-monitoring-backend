package app.web.weightModule.application.query;

import app.web.weightModule.application.dto.WeightModuleLastQueryDto;
import app.web.weightModule.application.port.query.WeightModuleLastPortFindAll;
import app.web.weightModule.domain.WeightModuleLastFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
class WeightModuleLastQueryImpl implements WeightModuleLastQuery {
    private final WeightModuleLastPortFindAll portFindAll;

    @Override
    public List<WeightModuleLastQueryDto> findAllWeightModuleLast(Pageable pageable) {
        return portFindAll.findAllWeightModuleLast(pageable)
                .stream()
                .map(WeightModuleLastFactory::toQueryDto)
                .collect(Collectors.toList());
    }
}
