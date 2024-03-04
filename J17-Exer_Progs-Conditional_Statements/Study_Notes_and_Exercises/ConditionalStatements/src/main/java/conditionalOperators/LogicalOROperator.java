package main.java.conditionalOperators;

public class LogicalOROperator {

    public static void main(String args[]) {

        int topScore = 100;
        int secondScore = 45;

        System.out.println("\n** (topScore = 100), (secondScore = 45) **");
        usingLogicalOR(topScore, secondScore);

        topScore = 60;
        secondScore = 88;

        System.out.println("\n** (topScore = 60), (secondScore = 88) **");
        usingLogicalOR(topScore, secondScore);

        topScore = 90;
        secondScore = 120;

        System.out.println("\n** (topScore = 90), (secondScore = 120) **");
        usingLogicalOR(topScore, secondScore);
    }

    public static void usingLogicalOR(int topScore, int secondScore) {

        if ((topScore < 100) || (secondScore > 80)) {
            System.out.println("(topScore < 100) || (secondScore > 80)");
        }

        if ((topScore > 100) || (secondScore < 100)) {
            System.out.println("(topScore > 100) || (secondScore < 100)");
        }

        if ((topScore == 90) || (secondScore >= 70)) {
            System.out.println("(topScore == 90) || (secondScore >= 70)");
        }
    }
}
