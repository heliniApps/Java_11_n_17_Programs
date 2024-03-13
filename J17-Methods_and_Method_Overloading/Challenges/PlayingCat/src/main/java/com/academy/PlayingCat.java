package com.academy;

public class PlayingCat {

    /**
     * Determines whether the cat is engaged in playtime, based on the temperature and the season.
     *
     * @param summer      is the season Summer.
     * @param temperature temperature value to be checked.
     * @return true, if the season is summer and temperature is between 25 - 45,
     * or if temperature is between 25 - 35 during other seasons.
     */
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (temperature >= 25) && (temperature <= 45) && (summer || (temperature <= 35));
    }

    /* Version 3 */
    public static boolean isCatPlayingV3(boolean summer, int temperature) {
        return (temperature >= 25) && temperature <= (summer ? 45 : 35);
    }

    /* Version 2
     * Simplifying ternary operator. */
    public static boolean isCatPlayingV2(boolean summer, int temperature) {
        return (temperature >= 25) && (summer ? (temperature <= 45) : (temperature <= 35));
    }

    /* Version 1 */
    public static boolean isCatPlayingV1(boolean summer, int temperature) {
        return summer ? (temperature >= 25) && (temperature <= 45) : (temperature >= 25) && (temperature <= 35);
    }
}