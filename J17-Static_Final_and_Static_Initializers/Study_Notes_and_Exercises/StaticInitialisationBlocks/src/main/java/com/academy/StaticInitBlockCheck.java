package com.academy;

/*
 * Output of creating an Instance of this Class -->
 *
 * 1st Static Init Block executed. MULTIPLIER = <no value yet>
 * 2nd Static Init Block executed. MULTIPLIER = 8
 * Constructor logic executed. MULTIPLIER = 8
 * Method logic executed.  answer = 56
 */
public class StaticInitBlockCheck {

    public static final int MULTIPLIER;

    static {
        System.out.println("1st Static Init Block executed. MULTIPLIER = <no value yet>");

        /*
         * Below statement causes a COMPILE ERROR.
         *
         * Reason -->
         * MULTIPLIER 'constant' (static final variable) is not initialised
         * at the time it is accessed/used.
         *
         * MULTIPLIER 'constant' is assigned a value in the "2nd Static Init Block".
         * Until it is executed, Constant will not be initialised.
         */
        // System.out.println("1st Static Init Block executed. MULTIPLIER = " + MULTIPLIER);
    }

    public StaticInitBlockCheck() {
        System.out.println("Constructor logic executed. MULTIPLIER = " + MULTIPLIER);
    }

    static {
        MULTIPLIER = 8;
        System.out.println("2nd Static Init Block executed. MULTIPLIER = " + MULTIPLIER);
    }

    public void multiplyAndPrint(int number) {
        int answer = number * MULTIPLIER;
        System.out.println("Method logic executed.  answer = " + answer);
    }
}
