package app.web.weightModule.application.service;

import app.web.weightModule.application.port.crud.WeightModulePortSave;
import app.web.weightModule.application.port.event.WeightModulePortEvent;
import app.web.weightModule.application.port.query.WeightModulePortFindByProductionLineId;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
class WeightModuleReportCreatorImpl implements WeightModuleReportCreator {
    private final WeightModulePortFindByProductionLineId portFindByProductionLineId;
    private final WeightModulePortFindByProductionLineId portFindLastByProductionLineId;
    private final WeightModulePortEvent portEvent;
    private final WeightModulePortSave portSave;

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void createReportForLine(long lineId) {
        portEvent.notifyAboutCreatingReportForLine(lineId);
        clearModuleProductData(lineId);
    }

    private void clearModuleProductData(long lineId) {
        portFindByProductionLineId.findByProductionLineIdWeightModules(lineId)
                .forEach(el -> {
                    el.clearProductInfo();
                    portSave.saveWeightModule(el);
                });

        portFindLastByProductionLineId.findByProductionLineIdWeightModules(lineId)
                .forEach(el -> {
                    el.clearProductInfo();
                    portSave.saveWeightModule(el);
                });
    }

}
