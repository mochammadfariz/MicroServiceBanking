package com.example.digitalbankingcustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DigitalBankingCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalBankingCustomerServiceApplication.class, args);
    }

}
