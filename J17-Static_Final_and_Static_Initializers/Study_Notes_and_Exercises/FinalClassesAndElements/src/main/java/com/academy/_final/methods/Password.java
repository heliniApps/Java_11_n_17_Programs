package com.academy._final.methods;

public class Password {

    private static final int KEY = 2147483647;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ KEY;
    }

    public void storePassword() {
        System.out.println("Storing the password in database. Stored value is " + encryptedPassword);
    }

    public boolean validate(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome!");
            return true;
        } else {
            System.out.println("Invalid password...");
            return false;
        }
    }
}
