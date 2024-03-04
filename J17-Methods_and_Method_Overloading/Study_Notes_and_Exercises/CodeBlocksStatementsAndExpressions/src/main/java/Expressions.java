package main.java;

public class Expressions {

    public static void main(String args[]) {
        /*
         * Expression includes:
         *   Variables,
         *   Literal values,
         *   Operators (e.g.: '=' , '+' , '*', etc...)
         *
         * It DOES NOT include:
         *   Data Type
         *   'Semicolon' at the end.
         */

        identifyingExpressionsInStatements();
        miniChallenge();
    }

    public static void identifyingExpressionsInStatements() {

        double numOfKilometers = (100d * 1.609d);
        /* 'Expressions' in the above 'Statement' are:
         *      numOfKilometers = (100d * 1.609d)
         *      (100d * 1.609d)
         */

        int highScore = 50;
        if (highScore >= 30) {
            highScore += 1000;
        }
        /* Expressions:
         *  highScore = 50
         *  highScore >= 30   (without the 'If ()' statement elements.)
         *  highScore += 1000
         */
    }

    public static void miniChallenge() {
        int health = 100;
        int highScore = 1050;

        if ((health < 25) && (highScore > 1000)) {
            highScore -= 1000;
        }

        /* All Expressions:
         * health = 100
         * highScore = 1050
         * (health < 25) && (highScore > 1000)
         * health < 25
         * highScore > 1000
         * highScore -= 1000
         *      [highScore = highScore - 1000]
         *      [highScore - 1000]
         */
    }
}
