package main.java.com.academy;

public class SpeedConverter {

    public static final double KMPH_CONVERSION_RATE = 1.609;

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) { return -1; }
        if (kilometersPerHour == 0) { return 0; }

        return Math.round(kilometersPerHour / KMPH_CONVERSION_RATE);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.printf("%s km/h = %d mi/h%n", kilometersPerHour, milesPerHour);
    }
}
