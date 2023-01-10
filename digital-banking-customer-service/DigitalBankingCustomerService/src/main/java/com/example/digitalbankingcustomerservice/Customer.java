package com.example.digitalbankingcustomerservice;

public class Customer {
    private int saldo;
    private int saldoAwal;
    private int nominalTarikTunai;


    public Customer(int saldo, int nominalTarikTunai) {
        this.saldo = saldo;
        this.nominalTarikTunai = nominalTarikTunai;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int id) {
        this.saldo = saldo;
    }

    public int getnominalTarikTunai() {
        return nominalTarikTunai;
    }

    public void setnominalTarikTunai(int nominalTarikTunai) {
        this.nominalTarikTunai = nominalTarikTunai;
    }


    @Override
    public String toString() {
        assert nominalTarikTunai <= saldo;
        saldoAwal = saldo;
        saldo -= nominalTarikTunai;
        return "Customer{" +
                "Saldo Awal=" + saldoAwal  +
                " Nominal Penarikan = " + nominalTarikTunai +
                " Sisa saldo=" + saldo +
                '}';
    }
}