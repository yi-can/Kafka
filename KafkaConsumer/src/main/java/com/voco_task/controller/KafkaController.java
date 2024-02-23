package com.voco_task.controller;



import com.voco_task.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaService kafkaService;
    @GetMapping("/hello")
    public String hi() {
        return "Hi: User Service";
    }




}
