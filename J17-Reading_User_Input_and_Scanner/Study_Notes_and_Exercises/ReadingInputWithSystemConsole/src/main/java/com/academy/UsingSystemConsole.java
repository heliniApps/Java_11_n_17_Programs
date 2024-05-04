package com.academy;

public class UsingSystemConsole {

    public static void main(String[] args) {

        readWithSystemConsole();
    }

    /*
     * System.console().readLine() ->
     * This will prompt the user for data, and return the received data as a String.
     */
    public static void readWithSystemConsole() {

        String name = System.console().readLine("\nHi, What's your name? ");
        System.out.println("Hi " + name + ", good to see you!");

        String yearOfBirth = System.console().readLine("\nWhat year were you born? ");
        String currentYear = System.console().readLine("\nBy the way, what year is this? ");

        int age = getAge(currentYear, yearOfBirth);
        System.out.println("So, you are " + age + " years old.");
    }

    public static int getAge(String currentYear, String userBirthYear) {
        int current = Integer.parseInt(currentYear);
        int yearOfBirth = Integer.parseInt(userBirthYear);
        return getAge(current, yearOfBirth);
    }

    public static int getAge(int currentYear, int userBirthYear) {
        return (currentYear - userBirthYear);
    }
}
