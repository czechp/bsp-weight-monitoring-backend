package app.web.weightModule.domain;

import app.web.weightModule.adapter.persistence.ProductionLineSimpleEntity;
import app.web.weightModule.adapter.persistence.WeightModuleEntity;

public class WeightModuleTestProvider {
    static WeightModuleEntity entity() {
        return new WeightModuleEntity(0L,
                new ProductionLineSimpleEntity(1L, ""),
                13f,
                11f,
                7,
                12.3f,
                true,
                100.0f,
                123_000,
                75.0f
        );
    }

    public static WeightModule domain() {
        return new WeightModule(
                1L,
                10L,
                "Some production line",
                new ProductInfoVO(),
                new ModuleStatusVO(),
                new ProductionIndicatorsVO()
        );
    }
}
