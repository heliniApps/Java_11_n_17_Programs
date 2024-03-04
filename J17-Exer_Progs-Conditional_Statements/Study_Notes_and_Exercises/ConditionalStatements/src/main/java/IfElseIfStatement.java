package main.java;

public class IfElseIfStatement {

    public static void main(String args[]) {

        int score = 6000;
        usingIfElseIf(score);

        score = 500;
        usingIfElseIf(score);

        score = 2000;
        usingIfElseIf(score);
    }

    public static void usingIfElseIf(int score) {

        if ((score < 5000) && (score > 1000)) {
            System.out.println("Score is <5000 and >1000.");
        } else if (score <= 1000) {
            System.out.println("Score is <=1000.");
        } else {
            System.out.println("Score is >=5000.");
        }
    }
}
