package com.example.consumerkafka2.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final List<String> senales = new CopyOnWriteArrayList<>();


    @KafkaListener(topics = "senales_topic", groupId = "group_id")
    public void consume_senales(String message) {
        System.out.println("S: " + message);
        senales.add(message);
    }
    
    public List<String> getSenales() {
        return senales;
    }
}