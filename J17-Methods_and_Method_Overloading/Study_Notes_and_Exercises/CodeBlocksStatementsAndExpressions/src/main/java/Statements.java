package main.java;

public class Statements {

    public static void main(String args[]) {
        statementExamples();
    }

    public static void statementExamples() {
        /*
         * Adding the "Data Type" and "Semicolon" makes this a statement.
         */
        int highScore = 100;

        /* Adding a "Semicolon" at the end, makes these Statements.
         * Otherwise, [highScore++] is just the Expression.
         */
        highScore++;
        highScore--;

        /* Adding a "Semicolon" at the end, makes this a Statement. */
        System.out.println("Some Text. " +
                "More text. " +
                "Another sentence.");
    }
}
