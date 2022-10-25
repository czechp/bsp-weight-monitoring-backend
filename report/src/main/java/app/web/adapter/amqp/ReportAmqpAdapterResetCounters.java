package app.web.adapter.amqp;

import app.web.application.port.ReportPortResetCounters;
import org.junit.jupiter.api.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
class ReportAmqpAdapterResetCounters implements ReportPortResetCounters {
    private final RabbitTemplate rabbitTemplate;
    private final Logger logger = LoggerFactory.getLogger(ReportAmqpAdapterResetCounters.class);
    @Value("${rabbitmq.weight.monitoring.exchange}")
    private String RESET_COUNTERS_EXCHANGE;

    ReportAmqpAdapterResetCounters(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void resetAllCounters() {
        rabbitTemplate.convertAndSend(RESET_COUNTERS_EXCHANGE,"", "RESET: " + LocalDateTime.now().toString());
        logger.info("----------------------Msg sent to {} order to reset PLC counters----------------------", RESET_COUNTERS_EXCHANGE);
    }
}
