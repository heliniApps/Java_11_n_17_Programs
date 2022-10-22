package com.academy;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name.trim();
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addNewBranch(String branchName) {

        if (!Branch.isValidBranchName(branchName)) {
            return false;
        }
        if (isBranchExists(branchName)) {
            return false;
        }

        return branches.add(new Branch(branchName));
    }

    public boolean addNewCustomer(String branchName, String customerName, double initialTransaction) {

        if (!Branch.isValidBranchName(branchName)) {
            return false;
        }

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewCustomer(customerName, initialTransaction);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {

        if (!Branch.isValidBranchName(branchName)) {
            return false;
        }

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addTransaction(customerName, transaction);
        }

        return false;
    }

    public Branch findBranch(String branchName) {
        return branches.get(searchBranch(branchName));
    }

    public boolean isBranchExists(String branchName) {

        int index = searchBranch(branchName);

        return (index >= 0);
    }

    public void printBranchCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName().trim());
            branch.printCustomers(showTransactions);
        }
    }

    public void printBranches(boolean showCustomers, boolean showTransactions) {

        for (int i=0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            System.out.println("Branch Name : " + branch.getName());

            if (showCustomers) {
                branch.printCustomers(showTransactions);
            }
        }
    }

    private int searchBranch(String branchName) {

        int index = -1;

        for (int i=0; i < branches.size(); i++) {
            if (branches.get(i).getName().trim().equalsIgnoreCase(branchName.trim())) {
                index = i;
                break;
            }
        }

        return index;
    }
}
