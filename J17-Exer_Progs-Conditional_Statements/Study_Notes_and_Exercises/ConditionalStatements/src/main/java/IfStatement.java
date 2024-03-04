package main.java;

public class IfStatement {

    public static void main(String args[]) {

        validIfStatements();
    }

    public static void validIfStatements() {
        boolean isAlien = false;

        if (isAlien == true) ;   /* This is VALID. But this 'If' statement does nothing. */

        /* VALID. When there is just one line to execute. No need of curly braces {}. */
        if (isAlien == false)
            System.out.println("It's not an Alien...");

        if (isAlien == false)
            System.out.println("\nIt's not an Alien.");
        System.out.println("It's Human. (outside 'If')"); // This is NOT part of the 'If' statement, when NO {}. This will always execute.

        /* VALID. All statements within the 'code block - {}' will execute. */
        if (isAlien == false) {
            System.out.println("\nIt's not an Alien.");
            System.out.println("It's Human. (inside 'If')");
        }

        /* Condition of the 'If' statement can be simplified as shown below,
         * if the expression (e.g.: isAlien) is a single 'boolean' variable.
         */
        if (isAlien) ;
        if (!isAlien) ;
    }
}
