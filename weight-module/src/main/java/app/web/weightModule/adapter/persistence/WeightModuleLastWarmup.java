package app.web.weightModule.adapter.persistence;

import org.junit.jupiter.api.Order;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Profile({"development", "test"})
class WeightModuleLastWarmup {

    @EventListener(ApplicationReadyEvent.class)
    @Order(3)
    void init() {

    }
}
