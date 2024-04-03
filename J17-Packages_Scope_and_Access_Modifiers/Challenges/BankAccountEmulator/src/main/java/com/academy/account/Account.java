package com.academy.account;

import java.util.List;

public class Account {

    private String name;
    private long number;
    private Balance balance;

    public Account(String name, long number) {
        this.name = name;
        this.number = number;
        this.balance = new Balance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance.getAmount();
    }

    public List<Double> getTransactions() {
        return this.balance.getTransactions();
    }

    public boolean deposit(double amount) {
        return this.balance.depositAmount(amount);
    }

    public boolean withdraw(double amount) {
        return this.balance.withdrawAmount(amount);
    }

    public void calculateBalance() {
        this.balance.calculateBalance();
    }
}
