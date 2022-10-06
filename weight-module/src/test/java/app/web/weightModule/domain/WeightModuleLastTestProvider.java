package app.web.weightModule.domain;

import app.web.weightModule.adapter.persistence.ProductionLineSimpleEntity;
import app.web.weightModule.adapter.persistence.WeightModuleLastEntity;

class WeightModuleLastTestProvider {
    static WeightModuleLastEntity toEntity(){
        return new  WeightModuleLastEntity(
                0L,
                0L,
                new ProductionLineSimpleEntity(1L, ""),
                17f,
                15f,
                11,
                16.4f,
                true,
                200.0f,
                300_000l,
                78.0f,
                100_000L,
                -200.3f,
                60.0f,
                100_000L,
                75_000,
                33.4f
        );
    }
}
