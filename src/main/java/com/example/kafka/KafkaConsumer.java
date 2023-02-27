package com.example.kafka;

import org.springframework.kafka.*;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic}")
    public void consume(String message) {
        // TODO: process the message
    }
}
