package com.academy.solarsystem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        assertNotNull(planet.getKey());
        assertNotNull(moon.getKey());
        System.out.println("planet.getKey() = " + planet.getKey());
        System.out.println("moon.getKey() = " + moon.getKey());
    }

    @Test
    void testAddPlanetaryObject() {
        planet.addPlanetaryObject(moon);
        assertEquals(1, planet.getPlanetaryObjects().size());
        for (InterstellarBody object : planet.getPlanetaryObjects()) {
            System.out.println("object.getName() = " + object.getKey().getName());
        }

        planet.addPlanetaryObject(dwarfPlanet);
        assertEquals(1, planet.getPlanetaryObjects().size());
        for (InterstellarBody object : planet.getPlanetaryObjects()) {
            System.out.println("2 :: object.getName() = " + object.getKey().getName());
        }
    }
}
