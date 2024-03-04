package main.java.challenges;

public class IfElseIfChallenge {

    public static void main(String args[]) {

        challenge1();
    }

    public static void challenge1() {
        // This challenge is continued in "Methods & Overloading" section.

        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelsCompleted * bonus);
            System.out.println("Final score is : " + finalScore);
        }

        score = 10_000;
        // levelsCompleted = 8;
        levelsCompleted = 10;
        bonus = 200;
        finalScore = score;

        if (levelsCompleted < 10) {
            gameOver = false;
        } else {
            gameOver = true;
        }
        /* Simplified version :
         * gameOver = (levelsCompleted < 10)
         */

        if (gameOver) {
            finalScore += (levelsCompleted * bonus);
            System.out.println("Game is over. Final score is " + finalScore);
        } else if (levelsCompleted <= 5) {
            System.out.println("Game just got started...");
        } else {
            System.out.println("Current score is " + score);
        }
    }

}
