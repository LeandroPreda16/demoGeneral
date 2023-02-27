package com.example.kafka;

import java.net.http.HttpHeaders;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class KafkaConsumer2 {

    private final RestTemplate restTemplate;

    public KafkaConsumer2(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @KafkaListener(topics = "${kafka.topic}")
    public void consume(String message) {
        // TODO: process the message and extract necessary data
        String apiUrl = "";// set the API endpoint URL
        HttpHeaders headers = null;// set the HTTP headers if needed
       // HttpEntity<String> request = new HttpEntity<>(message, headers);
        HttpEntity<String> request = new HttpEntity<>(message);
        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, request, String.class);
        // TODO: handle the response
    }
}
