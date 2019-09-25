package com.kafka.demo.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "nayan", groupId = "group-id")
    public void consume(String message){
        System.out.println("Message Received : "+message);
        logger.info(String.format("Message Received : %s",message));
    }
}
