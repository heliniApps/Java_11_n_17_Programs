package com.academy.solarsystem;

import com.academy.enums.BodyType;

public class Moon extends InterstellarBody {

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.MOON);
    }
}
