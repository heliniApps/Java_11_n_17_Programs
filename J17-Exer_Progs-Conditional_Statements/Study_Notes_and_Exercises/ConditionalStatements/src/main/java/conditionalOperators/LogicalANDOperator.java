package main.java.conditionalOperators;

public class LogicalANDOperator {

    public static void main(String args[]) {

        int topScore = 100;
        int secondScore = 85;

        System.out.println("\n** (topScore = 100), (secondScore = 85) **");
        usingLogicalAND(topScore, secondScore);

        topScore = 90;
        secondScore = 70;

        System.out.println("\n** (topScore = 90), (secondScore = 70) **");
        usingLogicalAND(topScore, secondScore);

        topScore = 75;
        secondScore = 115;

        System.out.println("\n** (topScore = 75), (secondScore = 115) **");
        usingLogicalAND(topScore, secondScore);
    }

    public static void usingLogicalAND(int topScore, int secondScore) {

        if ((topScore > 100) && (secondScore < 100)) {
            System.out.println("(topScore > 100) &&(secondScore < 100)");
        }

        if ((topScore > 80) && (secondScore < 90)) {
            System.out.println("(topScore > 80) && (secondScore < 90)");
        }

        if ((topScore == 100) && (secondScore == 85)) {
            System.out.println("(topScore == 100) && (secondScore == 85)");
        }

        if ((topScore <= 90) && (secondScore >= 85)) {
            System.out.println("(topScore <= 90) && (secondScore >= 85)");
        }
    }
}
