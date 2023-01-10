package com.example.digitalbankingclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class
DigitalBankingClientController {
    @Autowired
    private RestTemplate rest;

    @GetMapping("/")
    public String getCustomer(){
        String cust1 = rest.getForObject("http://digital-banking-customer-service/john", String.class);
        String cust2 = rest.getForObject("http://digital-banking-customer-service/smith", String.class);
        return cust1 + " is first customer || " + cust2 + " is second customer";
    }
}
