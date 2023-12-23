package main.java.com.academy.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Challenges {

    public static void main(String[] args) {

        Challenges challenges = new Challenges();

        // Exer1
        challenges.convertRunnableTask();

        // Exer2
        String message = "1234567890";
        Function<String, String> everySecondCharFunc = (source -> {
            StringBuilder returnStr = new StringBuilder();
            // for (int i=1; i < source.length(); i+=2) {
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnStr.append(source.charAt(i));
                }
            }
            return returnStr.toString();
        });
        // System.out.println(everySecondCharFunc.apply(message));
        String result = challenges.everySecondChar(everySecondCharFunc, message);
        System.out.println(result);

        // Exer3
        Supplier<String> msgSupplier = (() -> "\nJust a message!");
        System.out.println(msgSupplier.get());

        System.out.println();

        // Exer4
        challenges.processNamesList();

    }

    private void convertRunnableTask() {
        Runnable runnableLambda = (() -> {
            String myString = "Let's split this up into an array.";
            Arrays.stream(myString.split(" "))
                    .forEach(System.out::println);
        });

        new Thread(runnableLambda).start();
    }

    private String everySecondChar(Function<String, String> fn, String source) {
        return fn.apply(source);
    }

    private void processNamesList() {
        List<String> names = getNames();

        // sorted names
        names.stream()
                .map(name ->
                        String.valueOf(name.charAt(0)).toUpperCase().concat(name.substring(1)))
                .sorted(Comparator.naturalOrder())        // .sorted(Comparator.comparing(Function.identity()))
                .forEach(System.out::println);

        System.out.println();

        // Names starting with "A"
        int startsWithACount = (int) names.stream()
                .map(name -> name.substring(0, 1).toUpperCase().concat(name.substring(1)))
                .filter(name -> name.startsWith("A"))
                .peek(System.out::println)
                .count();

        System.out.println("Starts With 'A' Count : " + startsWithACount);

        System.out.println();

        // Grouping by first letter.
        Map<String, List<String>> groupByFirstLetter =
                names.stream()
                        .map(name -> name.substring(0,1).toUpperCase().concat(name.substring(1)))
                        .peek(System.out::println)
                        .sorted(String::compareTo)
                        .collect(Collectors.groupingBy(name -> String.valueOf(name.charAt(0))));

                        /*.collect(Collectors.groupingBy(
                                (name -> String.valueOf(name.charAt(0))),
                                LinkedHashMap::new,
                                Collectors.toList()
                        ));*/

        groupByFirstLetter.forEach((key, list) ->
                            System.out.printf("Key: %s , Value: %s%n", key, Arrays.toString(list.toArray())));

    }

    private List<String> getNames() {
        return Arrays.asList(
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
    }
}

// Exer 1 Text:
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array.";
                String[] parts = myString.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };*/

// Exer 2 Text:
        /*private String everySecondChar(String source) {
            StringBuilder returnStr = new StringBuilder();
            // for (int i=1; i < source.length(); i+=2) {
            for (int i=0; i < source.length(); i++) {
                if (i%2 == 1){
                    returnStr.append(source.charAt(i));
                }
            }
            return returnStr.toString();
        }*/