package com.example.config;

import java.time.Duration;
import java.util.Collection;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.example.interceptors.MyCustomInterceptor;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder
            .setConnectTimeout(Duration.ofSeconds(10))
            .additionalMessageConverters(new MappingJackson2HttpMessageConverter())
            .interceptors((Collection<ClientHttpRequestInterceptor>) new MyCustomInterceptor())
            .build();
    }

}
