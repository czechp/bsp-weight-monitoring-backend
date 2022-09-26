package app.web.weightModule.application.useCase;

import app.web.weightModule.application.dto.WeightModuleUpdateDto;
import app.web.weightModule.application.port.crud.WeightModulePortSave;
import app.web.weightModule.application.port.query.WeightModulePortFindById;
import app.web.weightModule.domain.WeightModule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
class WeightModuleUseCaseUpdateDataImpl implements WeightModuleUseCaseUpdateData{
    private final WeightModulePortFindById portFindById;
    private final WeightModulePortSave portSave;

    @Override
    @Transactional
    public WeightModule updateWeightModuleData(long weightModuleId, WeightModuleUpdateDto weightModuleUpdateDto) {
        WeightModule weightModuleToUpdate = portFindById.findByIdWeightModuleOrThrowException(weightModuleId);
        WeightModule updatedWeightModule = weightModuleToUpdate.updateData(weightModuleUpdateDto);
        portSave.saveWeightModule(updatedWeightModule);
        return updatedWeightModule;
    }
}
