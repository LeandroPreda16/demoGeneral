package com.example.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.repository.RedisRepository;

@Service
public class MessageService {

    private final RedisRepository redisRepository;

    public MessageService(RedisRepository redisRepository) {
        this.redisRepository = redisRepository;
    }

    @KafkaListener(topics = "${kafka.topic}")
    public void consume(String message) {
        // TODO: process the message
        String key = "";// generate Redis key based on message data
        String value = "";// generate Redis value based on message data
        //Entity entity = new Entity(key, value);
        //redisRepository.save(entity);
    }
}

