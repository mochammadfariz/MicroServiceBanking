package com.example.digitalbankingcustomerservice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.Assert.*;



@SpringBootTest
class DigitalBankingCustomerServiceApplicationTests {
    @Test
    @DisplayName("Password Validation")
    public void assertPasswordValidation() {
        String password = "alzy123";
        String validationPassword = "alzy123w";

        assertEquals(password,validationPassword);
    }

    @Test
    @DisplayName("Withdrawal System")
    public void assertWithDrawal() {
        Integer saldo = 100;
        Integer tarikTunai = 200;
        assertFalse("Tarik tunai gagal karena saldo tidak mencukupi",tarikTunai>saldo);
//        Integer balance = 1000000;
//        Integer amount = 200000;
//        assert amount <= balance;
//        balance -= amount;
//        System.out.println("jumlah saldonya" + balance);
    }
}
