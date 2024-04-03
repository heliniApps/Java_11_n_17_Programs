package com.academy.account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balance {

    private double amount;
    private List<Double> transactions;

    public Balance() {
        this.amount = 0.0;
        this.transactions = new ArrayList<>();
    }

    public double getAmount() {
        return this.amount;
    }

    public List<Double> getTransactions() {
        return Collections.unmodifiableList(this.transactions);
    }

    public void calculateBalance() {
        double currentBalance = 0;
        for (double transaction : transactions) {
            currentBalance += transaction;
        }
        this.amount = currentBalance;
    }

    public boolean depositAmount(double value) {
        if (value < 0) {
            return false;
        }
        this.transactions.add(value);
        this.amount += value;
        return true;
    }

    public boolean withdrawAmount(double value) {
        if (value < 0) {
            return false;
        }
        this.transactions.add(-value);
        this.amount -= value;
        return true;
    }
}
