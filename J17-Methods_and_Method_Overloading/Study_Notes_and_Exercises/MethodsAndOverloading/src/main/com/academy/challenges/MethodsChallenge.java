package com.academy.challenges;

public class MethodsChallenge {

    public static void main(String args[]) {

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Ben", calculateHighScorePosition(490));
        displayHighScorePosition("Mary", calculateHighScorePosition(600));
        displayHighScorePosition("Angel", calculateHighScorePosition(45));
    }

    public static int calculateHighScorePosition(int score) {
        int highScore = 4;

        if (score >= 1000) {
            highScore = 1;
        } else if (score >= 500) {
            highScore = 2;
        } else if (score >= 100) {
            highScore = 3;
        }
        return highScore;
    }

    public static int calculateHighScorePositionV1(int score) {
        int highScore = 4;

        if (score >= 1000) {
            highScore = 1;
        } else if ((score >= 500) && (score < 1000)) {
            highScore = 2;
        } else if ((score >= 100) && (score < 500)) {
            highScore = 3;
        }

        return highScore;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name.trim() + " managed to get into position " +
                position + " on the high score list");
    }
}
