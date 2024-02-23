package com.kafka.controller;


import com.kafka.model.KafkaModel;
import com.kafka.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {

    String topicName= "order-create";

    private final KafkaService kafkaService;
    @GetMapping("/hello")
    public String hi() {
        return "Hi: User Service";
    }



    @PutMapping("/kafka/object")
    public ResponseEntity<String> kafkaObject(@RequestBody KafkaModel kafkaModel){
        return ResponseEntity.ok(kafkaService.kafkaObject(topicName, kafkaModel));
    }

}
