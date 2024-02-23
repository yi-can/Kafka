package com.voco_task.service;

import com.voco_task.model.KafkaModel;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class KafkaService{

    private static final String TOPIC_NAME = "order-create";
    private static final String GROUP_ID = "groupID";

    @KafkaListener(topics = TOPIC_NAME, groupId = GROUP_ID, containerFactory = "kafkaListenerContainerFactory")
    public void listener(@Payload KafkaModel kafkaModel, ConsumerRecord c) throws Exception {
        try {
            System.out.println("Kafka consumer denemesinden Email => " + kafkaModel.getEmail());
            System.out.println("Kafka consumer denemesinden Firstname => " + kafkaModel.getFirstname());
            System.out.println("Kafka consumer denemesinden Token => " + kafkaModel.getToken());
        } catch (Exception e) {

        }
    }

}
