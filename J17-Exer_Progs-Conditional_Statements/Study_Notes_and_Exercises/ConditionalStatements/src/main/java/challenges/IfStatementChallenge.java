package main.java.challenges;

public class IfStatementChallenge {

    public static void main(String args[]) {

        challenge1();
        challenge2();

    }

    public static void challenge1() {
        /*
         * int newValue = 50;
         * if (newValue = 50) {
         *     System.out.println("true");
         * }
         */
        // This code causes a Compile Error.
        // Using the assignment operator (=), instead of Equality operator (==).
        // Therefore, it doesn't produce a 'boolean' output.
    }

    public static void challenge2() {

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to be printed.");
        }
        // Above code DOES NOT cause a Compile Error.
        // But, the Output is INVALID.
        /* Reason ->
         * (isCar = true) expression will assign the value 'true' to "isCar" boolean variable.
         * Condition will then, evaluate the incorrect "isCar" variable as an expression.
         */

        /* Valid IF statements -> */
        if (isCar == true) ;
        if (isCar) ;
    }
}
