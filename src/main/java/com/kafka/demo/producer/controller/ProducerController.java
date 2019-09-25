package com.kafka.demo.producer.controller;

import com.kafka.demo.producer.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    KafkaSender kafkaSender;

    @GetMapping("/sendMessage/{message}")
    public String sendMessage(@PathVariable("message") final String message){
        kafkaSender.send(message);
        return "Message Published";
    }
}
