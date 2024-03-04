package main.java.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BingoNumberStreams {

    /*
     * Two requirements of Streams:
     *
     * Non-interfering -> Doesn't change the source Collection
     * Stateless -> Operations doesn't depend on any state outside that operation.
     *              (e.g.: variable or value of the previous operation)
     **/

    public static void main(String args[]) {

        List<String> bingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29", "i5", "i34",
                "O71");

        // printNumbersStartingWithG(bingoNumbers);

        System.out.println();
        // sortBingoNumsWithoutStreams(bingoNumbers);

        System.out.println();
        usingStreams(bingoNumbers);
    }

    public static void usingStreams(List<String> bingoNumbers) {
        System.out.println("\nCollection values before starting :: ");
        bingoNumbers.forEach(System.out::println);

        /* "map()" method takes in a "Function" argument. */
        Function<String, String> mapFunc = String::toUpperCase;

        /* "filter()" method accepts a "Predicate" argument. */
        Predicate<String> filterPredicate = (s) -> s.startsWith("I");

        System.out.println("\nReverse sorting full Collection :: ");
        bingoNumbers
                .stream()
                .map(mapFunc)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("\nFilter and sort :: ");
        bingoNumbers
                .stream()
                .map(mapFunc)
                .filter(filterPredicate)
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nCollection after Stream operations :: ");
        bingoNumbers.forEach(System.out::println);
    }

    public static void sortBingoNumsWithoutStreams(List<String> bingoNumbers) {
        List<String> startsWithGNums = new ArrayList<>();

        bingoNumbers.forEach((bingoNum) -> {
            if (bingoNum.toUpperCase().startsWith("G")) {
                startsWithGNums.add(bingoNum);
            }
        });

        startsWithGNums.sort(Comparator.naturalOrder());
        startsWithGNums.forEach(System.out::println);
    }

    public static void printNumbersStartingWithG(List<String> bingoNumbers) {
        Predicate<String> startsWithG = (bingoNum) -> bingoNum.startsWith("G");

        bingoNumbers.forEach((bingoNum) -> {
            if (startsWithG.test(bingoNum)) {
                System.out.println(bingoNum);
            }
        });
    }

}
