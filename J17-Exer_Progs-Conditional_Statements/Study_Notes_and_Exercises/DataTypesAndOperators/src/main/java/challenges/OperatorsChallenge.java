package main.java.challenges;

public class OperatorsChallenge {

    public static void main(String args[]) {

        compoundOperatorsChallenge1();
    }

    public static void compoundOperatorsChallenge1() {
        int result = 10;
        result -= 2;
        System.out.println("(result -= 2) => " + result);   // Output: 8

        /* result = result - 4.5; */ // ERROR - produces a Double output.

        double doubleVal = 9.8;
        /* result = 5 - doubleVal; */ // ERROR - produces a Double output.


        /* Yet, the below statement is VALID. No Error is thrown.
         * An implicit "cast" is done when using the "compound assignment operator".
         * Therefore, No Error occurs.
         * But, unexpected results may occur.
         */
        result -= 4.5;
        System.out.println("(result -= 4.5) => " + result);     // Output: 3 [ not 3.5]
    }
}
