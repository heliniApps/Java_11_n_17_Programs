package com.academy.solarsystem;

import com.academy.enums.BodyType;

public class DwarfPlanet extends InterstellarBody {

    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.DWARF_PLANET);
    }
}
