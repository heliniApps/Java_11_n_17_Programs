package com.academy;

public class TraditionalSwitch {

    public static void main(String[] args) {

        convertIfElseToTraditionalSwitch();
        nestedCaseSwitch();
        fallThroughSwitch();
        validDataTypesWithSwitch();
        invalidDataTypesWithSwitch();
        returningValuesFromSwitch();
    }

    public static void convertIfElseToTraditionalSwitch() {
        int value = 1;
        if (value == 1) {
            System.out.println("IF-ELSE :: Value is 1.");
        } else if (value == 2) {
            System.out.println("IF-ELSE :: Value is 2.");
        } else {
            System.out.println("IF-ELSE :: Value is neither 1 nor 2.");
        }

        // Switch statement.

        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1.");
                break;
            case 2:
                System.out.println("Value is 2.");
                break;
            default:
                System.out.println("Value is neither 1 or 2.");
                break;
        }
    }

    /* Nesting the 'case' statements to simplify the switch. */
    public static void nestedCaseSwitch() {
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1.");
                break;
            case 2:
                System.out.println("Value is 2.");
                break;

            case 3:
            case 4:
            case 5:
                /* These nested case statements (3 - 5),
                 * will share the same code block below. (until the 'break') */

                System.out.println("Value in the nested cases = " + switchValue);
                break;
            default:
                System.out.println("Value is not within 1 - 5.");
                break;
        }
    }

    /* In this "switch", due to the lack of a 'break' statement,
     * execution will fall through to the subsequent case statements,
     * listed below the 'matched case', until another break statement is found OR,
     * until the end of the Switch statement.
     */
    public static void fallThroughSwitch() {
        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1.");
                break;
            case 2:
                System.out.println("Value is 2.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Fall Through Nested Case Value = " + switchValue);
                // Fall through to "case 6:", and then, stop at the 'break' in there.
            case 6:
                System.out.println("Value is 6.");
                break;
            default:
                System.out.println("Value is not between 1 - 6.");
                break;
        }
    }

    /* VALID Data Types. */
    public static void validDataTypesWithSwitch() {
        System.out.println("\n** Valid Data Types **");

        /* Valid Numeric Data Types.
         * Also Valid with wrapper classes of these. */
        byte byteValue = 3;
        short shortValue = 5;
        int intValue = 45;

        /* Valid String Data Types. */
        char charValue = 'y';
        String myString = "hello";

        /* Object Types. */
        // Enum

        switch (byteValue) {
            case 1:
            case 2:
                System.out.println("Value is 1 or 2.");
                break;
            case 3:
                System.out.println("Found a match. Value is 3.");
                break;
        }

        switch (charValue) {
            case 'y':
                System.out.println("User clicked YES.");
                break;
            case 'n':
                System.out.println("User clicked NO.");
                break;
        }
    }

    /* INVALID Data Types */
    public static void invalidDataTypesWithSwitch() {
        System.out.println();

        long longValue = 4L;
        double doubleValue = 7.8d;
        float floatValue = 30.5f;
        boolean booleanValue = true;

        // ERROR :::  Incompatible types.
        // Found: 'long',
        // required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
        /*switch (longValue) {
            case 4:
                System.out.println("value is 4.");
                break;
            case 5:
                System.out.println("value is 5.");
                break;
        }*/
    }

    /* When returning values from "switch", No need to add the "break". */
    public static void returningValuesFromSwitch() {

        System.out.println("\nStudent's result status for 55 = " + getStatus(55));
        System.out.println("Student's result status for 95 = " + getStatus(95));
        System.out.println("Student's result status for 75 = " + getStatus(75));
    }

    private static String getStatus(int marks) {
        switch (marks) {
            case 45:
                return "Fail";
            case 55:
                return "Pass";
            case 95:
                return "Distinction";
            default:
                return "Merit";
        }
    }
}