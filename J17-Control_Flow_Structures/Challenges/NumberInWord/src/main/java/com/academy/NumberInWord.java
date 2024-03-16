package com.academy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberInWord {

    /**
     * Prints out the word that matches the number.
     * Using 'switch' as an expression. (returning a value)
     *
     * @param number - number to print the matching word.
     */
    public static void printNumberInWord(int number) {
        String word = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(word);
    }

    /* Version 5
     * Using a HashMap to store the phrases against their equivalent numbers.
     * Retrieve using the 'number' argument as the 'key'.
     */
    public static void printNumberInWordV5(int number) {
        String otherPhrase = "OTHER";
        Map<Integer, String> words = new HashMap<>();
        words.put(0, "ZERO");
        words.put(1, "ONE");
        words.put(2, "TWO");
        words.put(3, "THREE");
        words.put(4, "FOUR");
        words.put(5, "FIVE");
        words.put(6, "SIX");
        words.put(7, "SEVEN");
        words.put(8, "EIGHT");
        words.put(9, "NINE");

        switch (number) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(words.get(number));
            default -> System.out.println(otherPhrase);
        }
    }

    /* Version 4
     * Words are inserted into a 'List' in the order from 0 to 9.
     * Retrieves phrase based on index determined by the insertion order.
     */
    public static void printNumberInWordV4(int number) {
        List<String> words = List.of("ZERO", "ONE", "TWO", "THREE",
                "FOUR", "FIVE", "SIX", "SEVEN",
                "EIGHT", "NINE");
        String otherPhrase = "OTHER";

        switch (number) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(words.get(number));
            default -> System.out.println(otherPhrase);
        }
    }

    /* Version 3
     * Word is retrieved based on array index.
     * 'number' parameter used as index.
     */
    public static void printNumberInWordV3(int number) {
        String[] words = {"ZERO", "ONE", "TWO", "THREE",
                "FOUR", "FIVE", "SIX", "SEVEN",
                "EIGHT", "NINE"};
        String otherPhrase = "OTHER";

        switch (number) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.println(words[number]);
            default -> System.out.println(otherPhrase);
        }
    }

    /* Version 1
     * 'switch' as a standalone statement. */
    public static void printNumberInWordV1(int number) {
        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }
}