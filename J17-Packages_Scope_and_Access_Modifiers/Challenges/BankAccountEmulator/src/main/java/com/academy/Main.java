package com.academy;

import com.academy.account.Account;

public class Main {

    public static void main(String[] args) {

        Account benAccount = new Account("Ben Cooper", 10809393);
        benAccount.calculateBalance();

        System.out.println("Initial balance: " + benAccount.getBalance());

        benAccount.deposit(5000d);
        benAccount.withdraw(650d);
        benAccount.withdraw(2500d);
        benAccount.deposit(2000d);
        benAccount.withdraw(10000d);

        System.out.println("Current balance v1: " + benAccount.getBalance());

        benAccount.deposit(8000d);

        System.out.println("Current balance v2: " + benAccount.getBalance());

        System.out.println("\nAll transactions:");
        for (double transaction : benAccount.getTransactions()) {
            System.out.println(transaction);
        }
    }
}
