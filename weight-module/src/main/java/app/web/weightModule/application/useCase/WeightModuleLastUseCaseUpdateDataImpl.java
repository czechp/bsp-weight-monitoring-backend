package app.web.weightModule.application.useCase;

import app.web.weightModule.application.dto.WeightModuleLastUpdateDto;
import app.web.weightModule.application.dto.WeightModuleUpdateDto;
import app.web.weightModule.application.port.crud.WeightModuleLastPortSave;
import app.web.weightModule.application.port.event.WeightModulePortEvent;
import app.web.weightModule.application.port.query.WeightModuleLastPortFindByIdOrThrow;
import app.web.weightModule.domain.WeightModuleLast;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class WeightModuleLastUseCaseUpdateDataImpl implements WeightModuleLastUseCaseUpdateData{
    private final WeightModuleLastPortFindByIdOrThrow portFindByIdOrThrow;
    private final WeightModulePortEvent portEvent;
    private final WeightModuleLastPortSave portSave;

    @Override
    public WeightModuleLast updateModuleData(long moduleId, WeightModuleUpdateDto moduleDataDto, WeightModuleLastUpdateDto moduleLastDataDto) {
        WeightModuleLast weightModuleLast = portFindByIdOrThrow.findByIdOrThrowException(moduleId);
        WeightModuleLast updatedWeightModuleLast = weightModuleLast.updateData(moduleDataDto, moduleLastDataDto);
        portSave.save(weightModuleLast);
        return updatedWeightModuleLast;
    }
}
