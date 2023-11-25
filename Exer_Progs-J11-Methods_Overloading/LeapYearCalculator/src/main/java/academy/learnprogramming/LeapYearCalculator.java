package academy.learnprogramming;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        if (! isValidYear(year)) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // return (year % 400 == 0);
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }

        return false;
    }

    static boolean isValidYear(int year) {
        return ((year >= 1) && (year <= 9999));
    }
}
