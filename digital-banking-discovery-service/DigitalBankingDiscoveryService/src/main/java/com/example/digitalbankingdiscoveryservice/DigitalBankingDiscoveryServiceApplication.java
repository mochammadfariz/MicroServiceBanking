package com.example.digitalbankingdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DigitalBankingDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalBankingDiscoveryServiceApplication.class, args);
    }

}
