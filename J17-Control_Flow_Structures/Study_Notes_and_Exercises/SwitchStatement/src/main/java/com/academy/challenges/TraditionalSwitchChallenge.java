package com.academy.challenges;

public class TraditionalSwitchChallenge {

    public static void printNatoPhoneticPhrase(char firstLetter) {
        String phrase = getNatoPhoneticPhrase(firstLetter);
        if (phrase.equals("")) {
            System.out.println("Letter '" + firstLetter + "' was not found in the switch.");
        } else {
            System.out.println(firstLetter + " = " + phrase);
        }
    }

    public static String getNatoPhoneticPhrase(char firstLetter) {
        switch (String.valueOf(firstLetter).toUpperCase()) {
            case "A":
                return "Able";
            case "B":
                return "Baker";
            case "C":
                return "Charlie";
            case "D":
                return "Dog";
            case "E":
                return "Easy";
            default:
                return "";
        }
    }
}
