package app.web.domain;

import app.web.adapter.DosingDeviceFirstEntity;
import app.web.adapter.FirstModuleEntity;

class DosingDeviceFactory {
    public static DosingDevice toDomain(DosingDeviceFirstEntity entity) {
        return new DosingDeviceFirst(
                entity.getId(),
                entity.getVersion(),
                new ModuleInfo(entity.getFirstModuleEntity().getId(), entity.getLineName()),
                entity.getLineName(),
                entity.getRecordNumber(),
                entity.getTotalMaterial(),
                new Measures(
                        entity.getLastMeasure(),
                        entity.getAmountBelowMeasures(),
                        entity.getAmountCorrectMeasures(),
                        entity.getAmountAboveMeasures(),
                        entity.getAverageMeasure(),
                        entity.getCorrectMeasurePercent()
                )
        );
    }

    public static DosingDeviceFirstEntity toEntity(DosingDevice domain) {
        return new DosingDeviceFirstEntity(
                domain.getId(),
                domain.getVersion(),
                domain.getModuleInfo().getLineName(),
                domain.getRecordNumber(),
                domain.getTotalMaterial(),
                domain.getMeasures().getLastMeasure(),
                domain.getMeasures().getAmountBelowMeasures(),
                domain.getMeasures().getAmountCorrectMeasures(),
                domain.getMeasures().getAmountAboveMeasures(),
                domain.getMeasures().getAverageMeasure(),
                domain.getMeasures().getCorrectMeasurePercent(),
                new FirstModuleEntity(domain.getModuleInfo().getModuleId())
        );
    }
}
