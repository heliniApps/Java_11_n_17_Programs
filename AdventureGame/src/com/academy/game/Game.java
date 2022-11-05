package com.academy.game;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    public static final String DIRECTION_NORTH = "N";
    public static final String DIRECTION_SOUTH = "S";
    public static final String DIRECTION_EAST = "E";
    public static final String DIRECTION_WEST = "W";
    public static final String DIRECTION_QUIT = "Q";

    public static final int BASE_LOCATION_ID = 0;

    /**
     * How to run the game:
     * Enter any input phrase such as, "Go West", "run South",
     * "I need to Quit this game" or just "East".
     * Then, the program will move to the appropriate location if there is one.
     */
    public void run() {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Location> locationMap = initLocationMap();
        Map<String, String> directionKeyMap = initDirectionKeyMap();

        if ((locationMap == null) || (directionKeyMap == null)) {
            return;
        }

        int locId = 1;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Current location is : " + locationMap.get(locId).getDescription());
            if (locId == BASE_LOCATION_ID) {
                isExit = true;
                continue;
            }
            Map<String, Integer> exits = locationMap.get(locId).getExits();

            System.out.print("Available directions for current location are : ");
            for (String exitKey : exits.keySet()) {
                System.out.print(exitKey + " ");
            }
            System.out.println();

            System.out.println("Enter new direction : ");
            String input = scanner.nextLine();
            String direction = getInputDirectionKey(input, directionKeyMap);

            if (exits.containsKey(direction.toUpperCase().trim())) {
                locId = exits.get(direction);
            } else {
                System.out.println("Direction is invalid.");
            }
        }
    }

    private String getInputDirectionKey(String input, Map<String, String> directionKeyMap) {
        String directionKey = "";
        String[] inputArr = input.split(" ");

        for (String phrase : inputArr) {
            phrase = phrase.toUpperCase().trim();
            if (directionKeyMap.containsKey(phrase)) {
                directionKey = directionKeyMap.get(phrase);
                break;
            }
        }
        return directionKey;
    }

    private Map<Integer, Location> initLocationMap() {

        Map<Integer, Location> locationMap = new LinkedHashMap<>();
        int locationId1 = 1;
        int locationId2 = 2;
        int locationId3 = 3;
        int locationId4 = 4;
        int locationId5 = 5;

        Map<String, Integer> tempExits = new LinkedHashMap<>();
        locationMap.put(BASE_LOCATION_ID, new Location(BASE_LOCATION_ID, "Home", tempExits));

        tempExits = new LinkedHashMap<>();
        tempExits.put(DIRECTION_NORTH, locationId5);
        tempExits.put(DIRECTION_SOUTH, locationId4);
        tempExits.put(DIRECTION_EAST, locationId3);
        tempExits.put(DIRECTION_WEST, locationId2);
        locationMap.put(locationId1, new Location(locationId1, "Office", tempExits));

        tempExits = new LinkedHashMap<>();
        tempExits.put(DIRECTION_NORTH, locationId5);
        locationMap.put(locationId2, new Location(locationId2, "Cafe", tempExits));

        tempExits = new LinkedHashMap<>();
        tempExits.put(DIRECTION_WEST, locationId1);
        locationMap.put(locationId3, new Location(locationId3, "Luncheon Hub", tempExits));

        tempExits = new LinkedHashMap<>();
        tempExits.put(DIRECTION_NORTH, locationId1);
        tempExits.put(DIRECTION_WEST, locationId2);
        locationMap.put(locationId4, new Location(locationId4, "Dinner Restaurant", tempExits));

        tempExits = new LinkedHashMap<>();
        tempExits.put(DIRECTION_SOUTH, locationId1);
        tempExits.put(DIRECTION_WEST, locationId2);
        locationMap.put(locationId5, new Location(locationId5, "Gym", tempExits));

        return locationMap;
    }

    private Map<String, String> initDirectionKeyMap() {

        Map<String, String> directionKeyMap = new HashMap<>();
        directionKeyMap.put("NORTH", DIRECTION_NORTH);
        directionKeyMap.put("SOUTH", DIRECTION_SOUTH);
        directionKeyMap.put("EAST", DIRECTION_EAST);
        directionKeyMap.put("WEST", DIRECTION_WEST);
        directionKeyMap.put("QUIT", DIRECTION_QUIT);
        directionKeyMap.put("N", DIRECTION_NORTH);
        directionKeyMap.put("S", DIRECTION_SOUTH);
        directionKeyMap.put("E", DIRECTION_EAST);
        directionKeyMap.put("W", DIRECTION_WEST);
        directionKeyMap.put("Q", DIRECTION_QUIT);

        return directionKeyMap;
    }

}
