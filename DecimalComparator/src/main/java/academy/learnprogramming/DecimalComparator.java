package academy.learnprogramming;

public class DecimalComparator {

    /*
    * Option 1: Comparing double values up to 3 decimal places.
    * */
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {

        return false;
    }

    /*
    * Option 2: Lengthy way of comparing double values up to 3 decimal places.
    * */
    public static boolean areEqualByThreeDecimalPlaces_v2(double value1, double value2) {

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

}
