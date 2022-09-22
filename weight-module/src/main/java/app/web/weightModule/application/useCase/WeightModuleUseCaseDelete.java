package app.web.weightModule.application.useCase;

import app.web.weightModule.domain.WeightModule;

public interface WeightModuleUseCaseDelete {
    WeightModule deleteWeightModuleById(long id);
}
