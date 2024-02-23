package com.kafka.service;

import com.kafka.model.KafkaModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String kafkaObject(String topicName, KafkaModel kafkaModel) {
        kafkaTemplate.send(topicName, kafkaModel);
        return "Senin ananı bacını sikeyim Kafka";
    }
}
