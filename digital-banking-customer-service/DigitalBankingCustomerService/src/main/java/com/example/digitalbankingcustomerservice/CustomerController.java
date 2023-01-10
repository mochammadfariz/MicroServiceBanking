package com.example.digitalbankingcustomerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/")
    public String getTarikTunai(){
        Customer c = new Customer(700,200);
        return " Tarik Tunai " +c.toString();
    }

}