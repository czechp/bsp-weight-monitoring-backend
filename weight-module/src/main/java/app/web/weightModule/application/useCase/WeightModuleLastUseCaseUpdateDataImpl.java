package app.web.weightModule.application.useCase;

import app.web.weightModule.application.dto.WeightModuleLastUpdateDto;
import app.web.weightModule.application.dto.WeightModuleUpdateDto;
import app.web.weightModule.application.port.crud.WeightModuleLastPortSave;
import app.web.weightModule.application.port.query.WeightModuleLastPortFindByIdOrThrow;
import app.web.weightModule.domain.WeightModuleLast;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class WeightModuleLastUseCaseUpdateDataImpl implements WeightModuleLastUseCaseUpdateData{
    private final WeightModuleLastPortFindByIdOrThrow portFindByIdOrThrow;
    private final WeightModuleLastPortSave portSave;

    @Override
    public WeightModuleLast updateModuleData(long moduleId, WeightModuleUpdateDto moduleDataDto, WeightModuleLastUpdateDto moduleLastDto) {
        return null;
    }
}
