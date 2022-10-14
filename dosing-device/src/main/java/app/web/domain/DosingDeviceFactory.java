package app.web.domain;

import app.web.adapter.persistence.DosingDeviceFirstEntity;
import app.web.adapter.persistence.DosingDeviceLastEntity;
import app.web.adapter.persistence.FirstModuleEntity;
import app.web.adapter.persistence.LastModuleEntity;

public class DosingDeviceFactory {
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

    public static DosingDevice toDomain(DosingDeviceLastEntity entity) {
        return new DosingDeviceLast(
                entity.getId(),
                entity.getVersion(),
                new ModuleInfo(entity.getLastModuleEntity().getId(), entity.getLineName()),
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

    public static DosingDeviceFirstEntity toEntity(DosingDeviceFirst domain) {
        return createFirstDosingDeviceEntity(domain);
    }

    public static DosingDeviceLastEntity toEntity(DosingDeviceLast domain) {
        return createLastDosingDeviceEntity(domain);
    }


    private static DosingDeviceFirstEntity createFirstDosingDeviceEntity(DosingDevice domain) {
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

    private static DosingDeviceLastEntity createLastDosingDeviceEntity(DosingDevice domain) {
        return new DosingDeviceLastEntity(
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
                new LastModuleEntity(domain.getModuleInfo().getModuleId())
        );
    }


}
