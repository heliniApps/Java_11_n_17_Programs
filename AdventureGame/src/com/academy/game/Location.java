package com.academy.game;

import java.util.LinkedHashMap;
import java.util.Map;

public class Location {

    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.exits = new LinkedHashMap<String, Integer>();
        this.exits.put(Game.DIRECTION_QUIT, Game.BASE_LOCATION_ID);
    }

    public int getLocationId() {
        return this.locationId;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, Integer> getExits() {
        return new LinkedHashMap<String, Integer>(this.exits);
    }

    public void addExit(String direction, int locationId) {
        this.exits.put(direction, locationId);
    }
}
