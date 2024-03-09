package com.academy;

public class BarkingDog {

    /**
     * @param barking   indicates whether the dog is barking.
     * @param hourOfDay hour of the day, which the dog barks.
     * @return true, if the dog barks between hour 22 and 8.
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        }
        return (barking && ((hourOfDay > 22) || (hourOfDay < 8)));
    }

    /* Version 2 */
    public static boolean shouldWakeUpV2(boolean barking, int hourOfDay) {
        return (barking && (((hourOfDay >= 0) && (hourOfDay < 8)) || (hourOfDay == 23)));
    }

    /* Version 1 (another implementation of the shouldWakeUp() function.) */
    public static boolean shouldWakeUpV1(boolean barking, int hourOfDay) {
        if ((hourOfDay >= 0) && (hourOfDay <= 23)) {
            return (barking && ((hourOfDay > 22) || (hourOfDay < 8)));
        }
        return false;
    }
}