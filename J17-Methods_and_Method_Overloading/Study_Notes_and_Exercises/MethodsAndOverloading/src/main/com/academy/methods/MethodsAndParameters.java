package com.academy.methods;

public class MethodsAndParameters {

    public static void main(String args[]) {

        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelsCompleted * bonus);
            if (finalScore > 1000) {
                finalScore += 200;
            }
            System.out.println("Final Score = " + finalScore);
        }

        /* Using 'variables' and 'literal values' as Method Arguments. */
        calculateFinalScore(gameOver, score, 5, 100);

        score = 10000;
        levelsCompleted = 8;
        bonus = 200;
        finalScore = score;

        if (gameOver) {
            finalScore += (levelsCompleted * bonus);
            System.out.println("Second final score = " + finalScore);
        }

        /*  Using 'variables' and an 'expression' (which results into a 'boolean' value.)
            as Method Arguments. */
        calculateFinalScore((levelsCompleted == 10), score, levelsCompleted, bonus);

        System.out.println();

        // Option 2
        calculateFinalScore(false, 800, 5, 100);
        calculateFinalScore(true, 10000, 8, 200);
    }

    /*
     * To execute a method that's defined with Parameters, we have to pass
     * variables, literal values or expressions,
     * that matches the data type, order and number of parameters
     * that are declared.
     */
    public static void calculateFinalScore(boolean gameOver, int score,
                                           int levelsCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelsCompleted * bonus);
            if (finalScore > 1000) {
                finalScore += 200;
            }
            System.out.println("Final Score (from method) = " + finalScore);
        }
    }
}
