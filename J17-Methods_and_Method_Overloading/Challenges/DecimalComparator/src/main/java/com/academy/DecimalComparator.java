package com.academy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    /**
     * Checks if two double numbers are the same, up to three decimal places.
     *
     * @param param1 first double value to be compared.
     * @param param2 second double value to be compared.
     * @return returns true, if both numbers are the same, up to three decimal places.
     */
    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {

        BigDecimal decimal1 = BigDecimal.valueOf(param1).setScale(3, RoundingMode.DOWN);
        BigDecimal decimal2 = BigDecimal.valueOf(param2).setScale(3, RoundingMode.DOWN);

        return (decimal1.doubleValue() == decimal2.doubleValue());
    }

    /* Version 2 */
    public static boolean areEqualByThreeDecimalPlacesV2(double param1, double param2) {
        return (int) (param1 * 1000) == (int) (param2 * 1000);
    }

    /* Version 1 */
    public static boolean areEqualByThreeDecimalPlacesV1(double param1, double param2) {
        int param1AsInt = (int) (param1 * 1000);
        int param2AsInt = (int) (param2 * 1000);

        return (param1AsInt == param2AsInt);
    }
}
