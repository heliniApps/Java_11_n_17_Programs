package main.java.challenges;

import java.util.List;

public class StreamChallenges {

    public static void main(String args[]) {

        challenge11();
        challenge12();
        challenge13();
    }

    public static void challenge13() {
        System.out.println("\nChallenge13 :: ");

        List<String> namesList = LambdaExprChallenges.getNamesList();
        List<String> filtered = namesList.stream()
                .map(LambdaExprChallenges.toUpperFirstLetter())
                .peek(System.out::println)
                .filter((name) -> name.startsWith("O"))
                .peek((name) -> System.out.println("Filtered::" + name))
                .toList();

        /*  Stream chains are lazily evaluated.
         *  Below example stream will not print anything. It Doesn't have a terminal operation.
         *  Therefore, intermediate operations are not evaluated.
         */
        /*namesList.stream()
                .map(LambdaExprChallenges.toUpperFirstLetter())
                .peek(System.out::println)
                .sorted(String::compareTo);*/
    }

    public static void challenge12() {
        System.out.println("\nChallenge12 :: ");

        List<String> namesList = LambdaExprChallenges.getNamesList();
        long nameCount = namesList.stream()
                .map(LambdaExprChallenges.toUpperFirstLetter())
                .filter((name) -> name.startsWith("A"))
                .count();

        System.out.println("Names starting with 'A' :: " + nameCount);
    }

    public static void challenge11() {
        System.out.println("\nChallenge11 :: ");

        List<String> namesList = LambdaExprChallenges.getNamesList();
        namesList.stream()
                .map(LambdaExprChallenges.toUpperFirstLetter())
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }

}
