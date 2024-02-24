package com.kafka.service;

import com.kafka.model.KafkaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class KafkaService{

    private final KafkaTemplate<String, Object> kafkaTemplate;
    public void kafka(String topicNeme, KafkaModel kafkaModel) {
        kafkaTemplate.send(topicNeme, kafkaModel);
    }
}
