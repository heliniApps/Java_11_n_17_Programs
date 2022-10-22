package com.academy;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        handleBankOperations();
        scanner.close();

    }

    private static void printOptionsMenu() {
        System.out.println("\n");
        System.out.println("Option 1: Print options menu.");
        System.out.println("Option 2: Add a new Branch");
        System.out.println("Option 3: Add a new Customer");
        System.out.println("Option 4: Add customer transaction.");
        System.out.println("Option 5: List all branches.");
        System.out.println("Option 6: List branch customers.");
        System.out.println("Option 7: Quit program.");
    }

    private static int readOption() {

        int option = 0;
        boolean isExit = false;

        while (!isExit) {
            isExit = true;
            System.out.println("\nEnter the number, related to the option to choose: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
            } else {
                isExit = false;
                System.out.println("Invalid value.");
            }
            scanner.nextLine();
        }

        return option;
    }

    private static void handleBankOperations() {

        boolean isExit = false;
        Bank bank = new Bank("Commonwealth Bank");

        printOptionsMenu();

        while (!isExit) {
            int option = readOption();

            switch (option) {
                case 1:
                    printOptionsMenu();
                    break;

                case 2:
                    addNewBranch(bank);
                    break;

                case 3:
                    addNewCustomer(bank);
                    break;

                case 4:
                    addCustomerTransaction(bank);
                    break;

                case 5:
                    bank.printBranches(true, false);
                    break;

                case 6:
                    printCustomers(bank);
                    break;

                case 7:
                    isExit = true;
                    System.out.println("Exiting Application.");
                    break;

                default:
                    System.out.println("Invalid Option.");
                    break;
            }
        }
    }

    private static void addNewBranch(Bank bank) {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();

        boolean isAdded = bank.addNewBranch(branchName);
        if (isAdded) {
            System.out.println("New branch " + branchName.trim() + " has been added.");
        } else {
            System.out.println("Error adding new branch");
        }
    }

    private static void addNewCustomer(Bank bank) {
        System.out.println("Enter Branch name: ");
        String branchName = scanner.nextLine();
        System.out.println("Enter new Customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter initial transaction amount: ");
        double amount = scanner.nextInt();
        scanner.nextLine();

        boolean isAdded = bank.findBranch(branchName).addNewCustomer(customerName, amount);
        if (isAdded) {
            System.out.println("New customer " + customerName.trim() + " has been added.");
        } else {
            System.out.println("Error adding new customer");
        }
    }

    private static void addCustomerTransaction(Bank bank) {
        System.out.println("Enter Branch name: ");
        String branchName = scanner.nextLine();
        System.out.println("Enter Customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter transaction amount: ");
        double amount = scanner.nextInt();
        scanner.nextLine();

        boolean isAdded = bank.findBranch(branchName).addTransaction(customerName, amount);
        if (isAdded) {
            System.out.println("New transaction has been added.");
        } else {
            System.out.println("Error adding new transaction");
        }
    }

    private static void printCustomers(Bank bank) {
        System.out.println("Enter Branch name: ");
        String branchName = scanner.nextLine();

        bank.printBranchCustomers(branchName, true);
    }
}
