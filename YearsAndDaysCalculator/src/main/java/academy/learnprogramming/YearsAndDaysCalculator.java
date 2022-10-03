package academy.learnprogramming;

public class YearsAndDaysCalculator {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes, int years, int days) {

        if ((minutes < 0) || (years < 0) || (days < 0)) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else{
            System.out.println(
                    String.format("%1$d min = %2$d y and %3$d d", minutes, years, days));
        }
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }

        int days = (int) minutes / (24 * 60);
        int years = days / 365;
        int remainingDays = days % 365;

        printYearsAndDays(minutes, years, remainingDays);
    }
}
