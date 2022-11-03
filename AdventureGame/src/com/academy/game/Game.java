package com.academy.game;

import java.util.HashMap;
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
        Map<Integer, Location> locationMap = new HashMap<>();
        Map<String, String> directionKeyMap = new HashMap<>();

        addLocations(locationMap);
        addInputDirectionKeys(directionKeyMap);

        int locId = 1;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Current location is : " + locationMap.get(locId).getDescription());
            if (locId == 0) {
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

    private void addLocations(Map<Integer, Location> locationMap) {

        int locationId1 = 1;
        int locationId2 = 2;
        int locationId3 = 3;
        int locationId4 = 4;
        int locationId5 = 5;

        locationMap.put(BASE_LOCATION_ID, new Location(BASE_LOCATION_ID, "Home"));
        locationMap.put(locationId1, new Location(locationId1, "Office"));
        locationMap.put(locationId2, new Location(locationId2, "Cafe"));
        locationMap.put(locationId3, new Location(locationId3, "Luncheon Hub"));
        locationMap.put(locationId4, new Location(locationId4, "Dinner Restaurant"));
        locationMap.put(locationId5, new Location(locationId5, "Gym"));

        locationMap.get(locationId1).addExit(DIRECTION_NORTH, locationId5);
        locationMap.get(locationId1).addExit(DIRECTION_SOUTH, locationId4);
        locationMap.get(locationId1).addExit(DIRECTION_EAST, locationId3);
        locationMap.get(locationId1).addExit(DIRECTION_WEST, locationId2);

        locationMap.get(locationId2).addExit(DIRECTION_NORTH, locationId5);

        locationMap.get(locationId3).addExit(DIRECTION_WEST, locationId1);

        locationMap.get(locationId4).addExit(DIRECTION_NORTH, locationId1);
        locationMap.get(locationId4).addExit(DIRECTION_WEST, locationId2);

        locationMap.get(locationId5).addExit(DIRECTION_SOUTH, locationId1);
        locationMap.get(locationId5).addExit(DIRECTION_WEST, locationId2);
    }

    private void addInputDirectionKeys(Map<String, String> directionKeyMap) {
        directionKeyMap.put("NORTH", "N");
        directionKeyMap.put("SOUTH", "S");
        directionKeyMap.put("EAST", "E");
        directionKeyMap.put("WEST", "W");
        directionKeyMap.put("QUIT", "Q");
        directionKeyMap.put("N", "N");
        directionKeyMap.put("S", "S");
        directionKeyMap.put("E", "E");
        directionKeyMap.put("W", "W");
        directionKeyMap.put("Q", "Q");
    }

}
