package main.java.conditionalOperators;

public class EqualityAndConditionalOperators {

    public static void main(String args[]) {

        int topScore = 100;
        System.out.println("\n(topScore = 100) =>  ");
        differentConditionalOperators(topScore);

        topScore = 80;
        System.out.println("\n(topScore = 80) =>  ");
        differentConditionalOperators(topScore);

        topScore = 110;
        System.out.println("\n(topScore = 110) => ");
        differentConditionalOperators(topScore);
    }

    public static void differentConditionalOperators(int topScore) {
        if (topScore == 100) {
            System.out.println("Top score is 100.");
        }

        if (topScore > 100) {
            System.out.println("Top score > 100");
        }

        if (topScore < 100) {
            System.out.println("Top score < 100");
        }

        if (topScore >= 80) {
            System.out.println("Top score >= 80");
        }

        if (topScore <= 100) {
            System.out.println("Top score <= 100");
        }

        if (topScore != 100) {
            System.out.println("Top score != 100");
        }
    }
}
