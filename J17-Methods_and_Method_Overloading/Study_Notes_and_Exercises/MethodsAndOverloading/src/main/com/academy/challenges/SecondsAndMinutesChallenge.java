package com.academy.challenges;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid number of 'minutes'.";
        }
        if ((seconds < 0) || (seconds > 59)) {
            return "Invalid number of 'seconds'.";
        }

        int numOfHours = (minutes / 60);
        int minutesRemainder = (minutes % 60);
        String durationString = formatDurationString(numOfHours, minutesRemainder, seconds);
        // Option-2
        /* String durationString = String.format("%1$02dh %2$02dm %3$02ds", numOfHours, minutesRemainder, seconds); */

        return durationString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid number of 'seconds'.";
        }
        int numOfMinutes = (seconds / 60);
        int secondsRemainder = (seconds % 60);

        return getDurationString(numOfMinutes, secondsRemainder);
    }

    public static String formatDurationString(int hours, int minutes, int seconds) {
        NumberFormat formatter = new DecimalFormat("00");
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append(formatter.format(hours)).append("h ");
        strBuilder.append(formatter.format(minutes)).append("m ");
        strBuilder.append(formatter.format(seconds)).append("s");

        return strBuilder.toString();
    }
}
