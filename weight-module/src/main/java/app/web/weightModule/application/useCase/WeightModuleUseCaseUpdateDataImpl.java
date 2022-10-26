package app.web.weightModule.application.useCase;

import app.web.weightModule.application.dto.WeightModuleUpdateDto;
import app.web.weightModule.application.port.crud.WeightModulePortSave;
import app.web.weightModule.application.port.event.WeightModulePortEvent;
import app.web.weightModule.application.port.query.WeightModulePortFindById;
import app.web.weightModule.domain.WeightModule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
class WeightModuleUseCaseUpdateDataImpl implements WeightModuleUseCaseUpdateData {
    private final WeightModulePortFindById portFindById;

    private final WeightModulePortEvent portEvent;
    private final WeightModulePortSave portSave;

    @Override
    @Transactional
    public WeightModule updateWeightModuleData(long weightModuleId, WeightModuleUpdateDto dto) {
        WeightModule weightModuleToUpdate = portFindById.findByIdWeightModuleOrThrowException(weightModuleId);
        final var dataChanged = weightModuleToUpdate.productDataChanged(dto.getProductDownRangeWeight(), dto.getProductUpRangeWeight());
        if(dataChanged){
            here
            return weightModuleToUpdate;
        }else{
            WeightModule updatedWeightModule = weightModuleToUpdate.updateData(dto);
            portEvent.notifyAboutUpdateDosingDevice(weightModuleId, dto.getDosingDevices(), true);
            portSave.saveWeightModule(updatedWeightModule);
            return updatedWeightModule;
        }
    }
}
