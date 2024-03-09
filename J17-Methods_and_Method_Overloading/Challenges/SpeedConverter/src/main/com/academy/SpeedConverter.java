package com.academy;

public class SpeedConverter {

    /**
     * Convert from Kilometers per hour to Miles per hour.
     *
     * @param kilometersPerHour number of Kilometers per hour.
     * @return rounded result, after converting from Kilometers per hour to Miles per hour.
     */
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        }
        double kilometersPerMile = 1.609d;

        return Math.round(kilometersPerHour / kilometersPerMile);
    }

    /**
     * Convert the Kilometers per hour to Miles per hour, and
     * print the result.
     *
     * @param kilometersPerHour number of Kilometers per hour.
     */
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        String conversionMsg = kilometersPerHour + " km/h = " + milesPerHour + " mi/h";
        if (milesPerHour == -1L) {
            conversionMsg = "Invalid Value";
        }
        System.out.println(conversionMsg);
    }

    public static void printConversionV1(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1L) {
            System.out.println("Invalid Value");
        } else {
            String conversionMsg = kilometersPerHour + " km/h = " + milesPerHour + " mi/h";
            System.out.println(conversionMsg);
        }
    }
}
