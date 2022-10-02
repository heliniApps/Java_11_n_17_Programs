package academy.learnprogramming;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    /*
    * Option 1: Comparing double values up to 3 decimal places. (without rounding)
    * This implementation uses BigDecimal.setScale() function to avoid the rounding of decimal points.
    * */
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {

        return decimalValueComparator(value1, value2, 3, RoundingMode.DOWN);
        
    }

    /*
     * Option 2: Comparing double values up to 3 decimal places. (without rounding)
     * This implementation uses a calculation based on Math.floor()/Math.Ceil() functions
     * to avoid the rounding of decimal points.
     * */
    public static boolean areEqualByThreeDecimalPlaces_v2(double value1, double value2) {

        if (Double.valueOf(value1).isNaN() || Double.valueOf(value2).isNaN()) {
            return false;
        }

        String formattedValue1;
        String formattedValue2;

        if (value1 < 0) {
            formattedValue1 = String.format("%1$.3f", (Math.ceil(value1 * 1000) / 1000));
        } else {
            formattedValue1 = String.format("%1$.3f", (Math.floor(value1 * 1000) / 1000));
        }

        if (value2 < 0) {
            formattedValue2 = String.format("%1$.3f", (Math.ceil(value2 * 1000) / 1000));
        } else {
            formattedValue2 = String.format("%1$.3f", (Math.floor(value2 * 1000) / 1000));
        }

        return (formattedValue1.trim().contentEquals(formattedValue2.trim()));
    }

    /*
    * Option 3: Lengthy way of comparing double values up to 3 decimal places.
    * */
    public static boolean areEqualByThreeDecimalPlaces_v3(double value1, double value2) {

        if (Double.valueOf(value1).isNaN() || Double.valueOf(value2).isNaN()) {
            return false;
        }

        String value1Str = String.valueOf(value1).trim();
        String value2Str = String.valueOf(value2).trim();

        int value1Length = value1Str.length();
        int value2Length = value2Str.length();

        String compareValue1 = value1Str;
        String compareValue2 = value2Str;

        for (int i=0; i < value1Length; i++) {
            if (value1Str.charAt(i) == '.') {
                // check if there are 3 decimal places in the given value.
                if (((value1Length - 1) - i) >= 3) {
                    compareValue1 = value1Str.substring(0, (i + 4));
                }
                break;
            }
        }

        for (int i=0; i < value2Length; i++) {
            if (value2Str.charAt(i) == '.') {

                if (((value2Length - 1) - i) >= 3) {
                    compareValue2 = value2Str.substring(0, (i + 4));
                }
                break;
            }
        }

        return (compareValue1.trim().contentEquals(compareValue2.trim()));
    }

    private static boolean decimalValueComparator(
            double value1,
            double value2,
            int decimalScale,
            RoundingMode roundingMode) {

        if (Double.valueOf(value1).isNaN() || Double.valueOf(value2).isNaN()) {
            return false;
        }
        if (decimalScale < 0) {
            return false;
        }
        if (roundingMode == null){
            return false;
        }

        BigDecimal bdValue1 = BigDecimal.valueOf(value1).setScale(decimalScale, roundingMode);
        BigDecimal bdValue2 = BigDecimal.valueOf(value2).setScale(decimalScale, roundingMode);

        return (bdValue1.equals(bdValue2));

    }
}
