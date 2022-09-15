package app.web.weightModule.application.query;

import app.web.weightModule.application.dto.WeightModuleQueryDto;
import app.web.weightModule.application.port.WeightModulePortFindAll;
import app.web.weightModule.domain.WeightModuleFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
class WeightModuleQueryImpl implements WeightModuleQuery{
    private final WeightModulePortFindAll portFindAll;

    @Override
    public List<WeightModuleQueryDto> findAllWeightModule(Pageable pageable) {
        return portFindAll.findAllWeightModule(pageable)
                .stream()
                .map(WeightModuleFactory::toQueryDto)
                .collect(Collectors.toList());
    }
}
