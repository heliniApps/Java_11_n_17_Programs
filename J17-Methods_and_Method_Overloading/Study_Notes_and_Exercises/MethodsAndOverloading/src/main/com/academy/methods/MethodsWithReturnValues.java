package com.academy.methods;

public class MethodsWithReturnValues {

    public static void main(String args[]) {

        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;

        /*
         * Method, which returns a value, can be used as an Expression, as shown below.
         * Return value can be assigned to a variable of a matching data type.
         */
        int finalScore = calculateFinalScore(gameOver, score, levelsCompleted, bonus);

        System.out.println("Final score = " + finalScore);

        score = 1000;
        levelsCompleted = 7;
        bonus = 200;
        gameOver = (levelsCompleted > 5);

        /*
         * Method, which returns a value, can be used just as a 'statement'.
         * If the 'return value' is not assigned to a variable or used in any other expression,
         * the value is ignored by the 'calling program code'.
         */
        calculateFinalScore(gameOver, score, levelsCompleted, bonus);

        // Possible option ->
        System.out.println("Second high score : " +
                calculateFinalScore(gameOver, score, levelsCompleted, bonus));
    }

    /*
     * Any Method can be called/executed as a 'Statement'.
     *
     * But, Only the Methods that return a value, can be used in an 'Expression'.
     */
    public static int calculateFinalScore(boolean gameOver, int score,
                                          int levelsCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelsCompleted * bonus);
            if (levelsCompleted > 5) {
                finalScore += 500;
            }
        }
        return finalScore;
    }
}
