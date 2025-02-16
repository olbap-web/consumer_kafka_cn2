package com.example.consumerkafka2.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "senales_topic", groupId = "group_id")
    public void consume_senales(String message) {
        System.out.println("S: " + message);
    }
    
}