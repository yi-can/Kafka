package com.kafka.controller;


import com.kafka.model.KafkaModel;
import com.kafka.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {

    String topicNeme = "order-create";

    private final KafkaService kafkaService;
    @GetMapping("/hello")
    public String hi() {
        return "Hi: User Service";
    }

    @PostMapping
    public void sendEvent(@RequestBody KafkaModel kafkaModel) {
        kafkaService.kafka(topicNeme, kafkaModel);
    }


}
