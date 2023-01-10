1. Program withdrawal (tarik tunai) berada pada modul digital-banking-customer-service. Cara menggunakannya adalah dengan memasukan input jumlah penarikan dan jumlah saldo pada file customerController yang berada di path digitalbanking\digital-banking-customer-service\DigitalBankingCustomerService\src\main\java\com\example\digitalbankingcustomerservice\CustomerController.java

2. Program testing berada di path digitalbanking\digital-banking-customer-service\DigitalBankingCustomerService\src\test\java\com\example\digitalbankingcustomerservice terdiri dari :

A. password validation 
password validation melakukan check apakah password yang diinput pada kolom re enter     password sudah sesuai dengan kolom password

B. withdrawal amount checker 
digunakan untuk mengecek apakah jumlah penarikan tunai melebihi batas nominal saldo, jika melebihi maka muncul error, sedangkan jika jumlah penarikan tunai masih dalam batas nominal saldo maka penarikan tunai berhasil.