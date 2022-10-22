package com.academy;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name.trim();
        transactions = new ArrayList<Double>();
        if (initialTransaction >= 0) {
            transactions.add(Double.valueOf(initialTransaction));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public boolean addTransaction(double transaction) {

        if (transaction <= 0) {
            return false;
        }
        return transactions.add(transaction);
    }

    public static boolean isValidCustomerName(String name) {
        return ((name != null) && (!name.isBlank()));
    }

    public static boolean isValidTransaction(double transaction) {
        return (transaction > 0);
    }

    public static Customer createCustomer(String name, double initialTransaction) {
        if (!isValidCustomerName(name) || (!isValidTransaction(initialTransaction))) {
            return null;
        }
        return new Customer(name, initialTransaction);
    }
}
