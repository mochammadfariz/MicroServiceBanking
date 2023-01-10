package com.example.digitalbankingclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DigitalBankingClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalBankingClientApplication.class, args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplateBean(){
        return new RestTemplate();
    }
}
