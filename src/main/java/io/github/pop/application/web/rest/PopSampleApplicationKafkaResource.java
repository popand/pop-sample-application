package io.github.pop.application.web.rest;

import io.github.pop.application.service.PopSampleApplicationKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/pop-sample-application-kafka")
public class PopSampleApplicationKafkaResource {

    private final Logger log = LoggerFactory.getLogger(PopSampleApplicationKafkaResource.class);

    private PopSampleApplicationKafkaProducer kafkaProducer;

    public PopSampleApplicationKafkaResource(PopSampleApplicationKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
