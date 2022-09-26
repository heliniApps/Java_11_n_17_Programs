package academy.learnProgramming;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking && isValidHourOfDay(hourOfDay)) {
            return true;
        }

        // return (barking && isValidHourOfDay(hourOfDay));
        return false;
    }

    public static boolean isValidHourOfDay(int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return ((hourOfDay < 8) || (hourOfDay > 22));
    }
}
