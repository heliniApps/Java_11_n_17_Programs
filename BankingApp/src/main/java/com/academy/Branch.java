package com.academy;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name.trim();
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialTransaction) {

        if (!Customer.isValidCustomerName(customerName)) {
            return false;
        }
        if (!Customer.isValidTransaction(initialTransaction)) {
            return false;
        }
        if (isCustomerExists(customerName)) {
            return false;
        }

        return customers.add(Customer.createCustomer(customerName, initialTransaction));

    }

    public boolean addTransaction(String customerName, double transaction) {

        if (!Customer.isValidTransaction(transaction)) {
            return false;
        }

        Customer customer = findCustomer(customerName);
        if (customer != null) {
            return customer.addTransaction(transaction);
        }

        return false;
    }

    public Customer findCustomer(String customerName) {
        return customers.get(searchCustomer(customerName));
    }

    public boolean isCustomerExists(String customerName) {

        int index = searchCustomer(customerName);

        return (index >= 0);
    }

    public void printCustomers(boolean showTransactions) {

        for (int i=0; i < customers.size(); i++) {
            System.out.println("Customer: " + customers.get(i).getName() + "[" + (i+1) + "]");

            if (showTransactions) {
                ArrayList<Double> transactions = customers.get(i).getTransactions();
                System.out.println("Transactions");
                for (int t = 0; t < transactions.size(); t++) {
                    System.out.println("[" + (t+1) + "]  Amount " + transactions.get(t));
                }
            }
        }
    }

    public static boolean isValidBranchName(String name) {
        return ((name != null) && (!name.isBlank()));
    }

    private int searchCustomer(String customerName) {

        int index = -1;

        for (int i=0; i < customers.size(); i++) {
            if (customers.get(i).getName().trim().equalsIgnoreCase(customerName.trim())) {
                index = i;
                break;
            }
        }

        return index;
    }
}
