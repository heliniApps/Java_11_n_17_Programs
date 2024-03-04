package main.java.conditionalOperators;

public class IfElseStatement {

    public static void main(String args[]) {

        int score = 5000;
        usingIfElseStatement(score);

        score = 3500;
        usingIfElseStatement(score);
    }

    public static void usingIfElseStatement(int score) {

        if (score < 5000) {
            System.out.println("Score is <5000.");
        } else {
            System.out.println("Score is >=5000.");
        }
    }
}
