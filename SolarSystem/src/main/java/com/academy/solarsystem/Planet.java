package com.academy.solarsystem;

import com.academy.enums.BodyType;

public class Planet extends InterstellarBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addPlanetaryObject(InterstellarBody planetaryObject) {
        if (planetaryObject.getBodyType().equals(BodyType.MOON)) {
            return super.addPlanetaryObject(planetaryObject);
        }
        return false;
    }
}
