package com.academy.challenges;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * Different implementation of overloaded 'getDurationString()' methods,
 * to what's found in "SecondsAndMinutesChallenge" class.
 */
public class SecondsAndMinutesVersion2 {

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid number of 'seconds'. Value should be a positive number.";
        }
        int minutes = (seconds / 60);
        int remainderSeconds = (seconds % 60);
        int hours = (minutes / 60);
        int remainderMinutes = (minutes % 60);

        return formatDurationString(hours, remainderMinutes, remainderSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid number of 'minutes'. Value should be a positive number.";
        }
        if ((seconds < 0) || (seconds > 59)) {
            return "Invalid number of 'seconds'. Value should be between 0 and 59 (inclusive).";
        }

        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }

    private static String formatDurationString(long hours, long minutes, long seconds) {
        NumberFormat formatter = new DecimalFormat("00");
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append(formatter.format(hours)).append("h ");
        strBuilder.append(formatter.format(minutes)).append("m ");
        strBuilder.append(formatter.format(seconds)).append("s");

        return strBuilder.toString();
    }
}
