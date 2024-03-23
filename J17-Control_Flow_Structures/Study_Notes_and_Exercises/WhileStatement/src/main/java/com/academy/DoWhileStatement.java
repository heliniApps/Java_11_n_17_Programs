package com.academy;

public class DoWhileStatement {

    public static void main(String[] args) {

        basicDoWhileLoop();
    }

    public static void basicDoWhileLoop() {
        boolean isReady = false;
        int i = 1;

        // Version 1:
        do {
            isReady = true;
            if (i == 5) {
                isReady = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (isReady);

        // Version 2:
        isReady = false;
        int j = 1;

        do {
            /* using (j <= 5) will print from 1 - 6, because we are not using "break".
             * Condition is checked after executing the code block. */
            isReady = (j < 5);

            System.out.println("j = " + j);
            j++;
        } while (isReady);
    }
}
