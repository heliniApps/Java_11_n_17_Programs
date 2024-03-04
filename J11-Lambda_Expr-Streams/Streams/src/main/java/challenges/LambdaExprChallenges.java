package main.java.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExprChallenges {

    public static void main(String args[]) {

        challenge1();
        challenge3();
        challenge4And5();
        challenge6And7();
        challenge9And10();

        /* Challenge 8 ::
         *
         * Qs 1:
         * To map a Lambda Expression to an Interface, it must be a Functional Interface.
         * It should only have one abstract method that needs to be overridden by an implementing class.
         * This way, compiler can infer the Lambda Expr signature using the method's signature.
         * There can be other methods with default implementation.
         *
         * Qs 2:
         * java.util.concurrent.Callable  ->
         *      This is a Functional Interface. It only has one abstract method "call()",
         *      which needs to be overridden.
         *      This can be mapped to a Lambda Expression.
         *
         * Qs 3:
         * java.util.Comparator  ->
         *      This is a Functional Interface. There are two abstract methods "compare()" & "equals()".
         *      "equals()" methods usually inherits a default implementation from the "Object" class.
         *      Therefore, only abstract method that developers need to override is "compare()" method.
         *      This can be mapped to a lambda expression.
         */

    }

    public static void challenge9And10() {
        List<String> namesList = getNamesList();
        Function<String, String> upperFirstLetter = toUpperFirstLetter();

        List<String> convertedNames = new ArrayList<>();
        namesList.forEach((name) -> convertedNames.add(upperFirstLetter.apply(name)));
        // convertedNames.sort(Comparator.naturalOrder());
        convertedNames.sort(String::compareTo);

        System.out.println("\nChallenge9 :: ");
        convertedNames.forEach(System.out::println);
    }

    public static Function<String, String> toUpperFirstLetter() {
        Function<String, String> upperFirstLetter = (name) -> {
            String firstLetter = String.valueOf(name.charAt(0)).toUpperCase();
            return firstLetter.concat(name.substring(1));
        };
        return upperFirstLetter;
    }

    public static List<String> getNamesList() {
        List<String> topNames = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        return topNames;
    }

    public static void challenge6And7() {
        Supplier<String> iLoveJava = () -> "I Love Java!";

        String supplierResult = iLoveJava.get();
        System.out.println("\nChallenge7 :: " + supplierResult);
    }

    public static void challenge4And5() {
        String result = everySecondCharacter(challenge2(), "1234567890");
        System.out.println("\nChallenge4 :: " + result);
    }

    private static String everySecondCharacter(Function<String, String> everySecondChar, String source) {
        return everySecondChar.apply(source);
    }

    public static void challenge3() {
        Function<String, String> everySecondChar = challenge2();
        String source = "1234567890";

        System.out.println("\n" + everySecondChar.apply(source));

        System.out.println(everySecondChar.andThen((returnVal) -> {
            System.out.println("\n**  " + returnVal);
            return "Done";
        }).apply(source));
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

    public static void challenge1() {
        Runnable runnableAnonymous = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        new Thread(runnable).start();
    }

}
