package com.academy;

public class WhileStatement {

    public static void main(String[] args) {

        basicWhileLoop();
    }

    /*  Basic "WHILE" loop.  */
    public static void basicWhileLoop() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Converting above "FOR" loop to a "While" loop.

        /* Checking the condition as the 'while' loop's "expression". */
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        /* Making the 'while' loop an infinite loop, and
         * checking the condition within the 'while' loop's Code Block.
         */
        int k = 1;
        while (true) {
            if (k > 5) {
                break;
            }
            System.out.println("k = " + k);
            k++;
        }
    }
}
