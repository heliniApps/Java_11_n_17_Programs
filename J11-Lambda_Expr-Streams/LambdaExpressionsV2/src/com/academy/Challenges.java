package com.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Challenges {

    public static void main(String args[]) {

        challenge1();
        challenge3();
        System.out.println(challenge4(challenge2(), "1234567890"));
        challenge6And7();
        challenge9();

        /* Challenge8 */
        /*
         *  The Interface must be a "functional interface".
         *  A Lambda Expression can be mapped to an Interface,
         *  if the particular Interface has only one abstract method that needs to be overridden
         *  by any implementing class.
         * */

        /*
         * java.util.concurrent.Callable
         * This is a functional interface. It only has one abstract method "call()",
         * that needs to be overridden.
         * Therefore, we can map it to a Lambda Expression.
         * */

        /*
         * java.util.Comparator
         * This is functional interface. It only has "compare()" abstract method,
         * that needs to be overridden.
         * It can be mapped to a Lambda Expression.
         * */

    }

    public static void challenge1() {
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array.";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        new Thread(runnable).start();
    }

    public static Function<String, String> challenge2() {
        Function<String, String> everySecondChar = (source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        return everySecondChar;
    }

    public static void challenge3() {
        Function<String, String> everySecondChar = challenge2();

        System.out.println(everySecondChar.apply("Every Second Char."));
        System.out.println(everySecondChar.apply("1234567890"));
    }

    public static String challenge4(Function<String, String> everySecondChar, String source) {
        return everySecondChar.apply(source);
    }

    public static void challenge6And7() {
        Supplier<String> iLoveJava = () -> "I love Java!";

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    private static List<String> getNames() {
        return Arrays.asList("Amelia", "Olivia", "emily",
                "Isla", "Ava", "oliver",
                "Jack", "Charlie", "harry",
                "Jacob");
    }

    public static void challenge9() {
        Function<String, String> upperFirstChar = (name) -> {
            String firstChar = String.valueOf(name.charAt(0)).toUpperCase();
            return firstChar.concat(name.substring(1));
        };

        List<String> originalNames = getNames();
        List<String> namesList = new ArrayList<>();

        originalNames.forEach((name) -> namesList.add(upperFirstChar.apply(name)));

        // namesList.sort((name1, name2) -> name1.compareTo(name2));
        // namesList.sort(String::compareTo);
        namesList.sort(Comparator.naturalOrder());

        namesList.forEach(System.out::println);
    }

}
