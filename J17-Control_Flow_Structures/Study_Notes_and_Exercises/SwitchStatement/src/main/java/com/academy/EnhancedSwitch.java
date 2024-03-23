package com.academy;

/**
 * Enhanced "switch" statement syntax had been a standard since Java 14.
 */
public class EnhancedSwitch {

    public static void main(String[] args) {

        syntaxBasicSwitch();        // basic
        syntaxSwitchAsExpression(); // expression

        String quarter = returningTheSwitchOutput("Oct");   // returning
        System.out.println(quarter);

        quarter = returningTheSwitchOutput("tag");
        System.out.println(quarter);
    }

    /*  BASIC Enhanced Switch.  */
    public static void syntaxBasicSwitch() {
        int intValue = 4;

        switch (intValue) {
            case 1 -> System.out.println("Value is 1.");
            case 2 -> System.out.println("Value is 2.");

            case 3, 4, 5 -> {   /* A Code Block */
                int newInt = intValue + 2;
                System.out.println("intValue + 2 = " + newInt);
            } /* No need of ";", at the end "}" of the code block. */

            default -> System.out.println("Doesn't match any case.");
        }
    }

    /*  Enhanced Switch as an Expression.  */
    public static void syntaxSwitchAsExpression() {
        String shortMonth = "Jun";

        // Below code causes a Runtime Error.
        // Reason:: "switch" statement doesn't have a "default" block.
        // ERROR MSG::  java: the switch expression does not cover all possible input values
        /*String quarter = switch (shortMonth) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> {
                yield "2nd";
            }
            case "Jul", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
        };*/


        String quarter = switch (shortMonth) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> {
                yield (shortMonth + " - 2nd");
            }
            case "Jul", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
            default -> {
                String msg = shortMonth + " is a bad quarter";
                yield msg;
            }
        };

        System.out.println("quarter = " + quarter);
    }

    /*  RETURN the entire "switch" to obtain it's output.  */
    public static String returningTheSwitchOutput(String shortMonth) {
        return switch (shortMonth) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> (shortMonth + " - 2nd");
            case "Jul", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
            default -> {
                yield (shortMonth + " is a bad quarter.");
            }
        };
    }
}
