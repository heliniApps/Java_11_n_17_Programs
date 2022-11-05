package com.academy.solarsystem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterstellarBodyTest {

    private static InterstellarBody planet;
    private static InterstellarBody moon;
    private static InterstellarBody dwarfPlanet;

    @BeforeAll
    public static void setUp() {
        planet = new Planet("Mars", 450);
        moon = new Moon("Moon", 30);
        dwarfPlanet = new DwarfPlanet("Pluto", 950);
    }

    @Test
    void testGetKey() {
        assertEquals("MARS:PLANET", planet.getKey());
        assertEquals("MOON:MOON", moon.getKey());
    }

    @Test
    void testAddPlanetaryObject() {
        planet.addPlanetaryObject(moon);
        assertEquals(1, planet.getPlanetaryObjects().size());
        for (InterstellarBody object : planet.getPlanetaryObjects()) {
            System.out.println("object.getName() = " + object.getName());
        }

        planet.addPlanetaryObject(dwarfPlanet);
        assertEquals(1, planet.getPlanetaryObjects().size());
        for (InterstellarBody object : planet.getPlanetaryObjects()) {
            System.out.println("2 :: object.getName() = " + object.getName());
        }
    }
}
