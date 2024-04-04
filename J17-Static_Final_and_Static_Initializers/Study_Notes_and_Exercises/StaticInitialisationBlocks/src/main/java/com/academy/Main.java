package com.academy;

public class Main {

    public static void main(String[] args) {

        StaticInitBlockCheck sibTest = new StaticInitBlockCheck();
        sibTest.multiplyAndPrint(7);

        /*
         * Static Initialisation Blocks are NOT executed during the instantiation of the below 2nd Object.
         * Reason ->
         * It has already run during the creation of first "sibTest" object.
         * Static Init Blocks will only run once at the first instantiation of that Class.
         */
        StaticInitBlockCheck secondSibTest = new StaticInitBlockCheck();
        secondSibTest.multiplyAndPrint(5);
    }
}
