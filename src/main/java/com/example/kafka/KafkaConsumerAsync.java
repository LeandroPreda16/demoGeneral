package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.service.MessageService;

@Component
public class KafkaConsumerAsync {
    
    private final MessageService messageService;

    public KafkaConsumerAsync(MessageService messageService) {
        this.messageService = messageService;
    }

    @KafkaListener(topics = "${kafka.topic}")
    public void consume(String message) {
        messageService.consume(message);
    }
}


