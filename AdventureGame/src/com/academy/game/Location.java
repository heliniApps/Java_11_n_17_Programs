package com.academy.game;

import java.util.LinkedHashMap;
import java.util.Map;

public final class Location {

    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description, Map<String, Integer> exits) {
        this.locationId = locationId;
        this.description = description;
        if (exits != null) {
            this.exits = new LinkedHashMap<>(exits);
        } else {
            this.exits = new LinkedHashMap<>();
        }
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
}
