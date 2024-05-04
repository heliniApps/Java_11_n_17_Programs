package com.academy;

public class ParsingInput {

    public static void main(String[] args) {

        String currentYearStr = "2022";
        String userYearOfBirthStr = "1980";

        System.out.println("Numeric values as Strings will concatenate. \n"
                + (currentYearStr + userYearOfBirthStr));

        // Parsing Integer.
        int currentYear = Integer.parseInt(currentYearStr);
        int userBirthYear = Integer.parseInt(userYearOfBirthStr);

        System.out.println("User's age = " + (currentYear - userBirthYear));

        // Parsing Double.
        String temperatureStr = "33.7";
        String circumferenceStr = "67.890";

        double circumference = Double.parseDouble(circumferenceStr);
        System.out.println("Circumference = " + circumference);
        System.out.println("Current Temperature: " + Double.parseDouble(temperatureStr));

        double diameter = circumference / Math.PI;
        System.out.println("Diameter = " + diameter);

        System.out.println("Math.sqrt(9) = " + Math.sqrt(9));
    }
}