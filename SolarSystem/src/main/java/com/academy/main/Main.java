package com.academy.main;

import com.academy.enums.BodyType;
import com.academy.solarsystem.DwarfPlanet;
import com.academy.solarsystem.InterstellarBody;
import com.academy.solarsystem.Moon;
import com.academy.solarsystem.Planet;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, InterstellarBody> solarSystem = new LinkedHashMap<>();
        Set<InterstellarBody> planets = new LinkedHashSet<>();

        InterstellarBody tempPlanet = new Planet("Mercury", 88);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Venus", 225);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new Planet("Earth", 365);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        InterstellarBody tempMoon = new Moon("Moon", 30);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addPlanetaryObject(tempMoon);

        tempPlanet = new Planet("Mars", 687);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addPlanetaryObject(tempMoon);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        tempPlanet.addPlanetaryObject(tempMoon);

        tempPlanet = new Planet("Pluto", 950);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        tempPlanet = new DwarfPlanet("Pluto", 250);
        solarSystem.put(tempPlanet.getKey(), tempPlanet);
        planets.add(tempPlanet);

        System.out.println("Solar system objects:");
        printSetElements(solarSystem.values());
        System.out.println();

        System.out.println("All Planets :");
        printSetElements(planets);
        System.out.println();

        Set<InterstellarBody> moons = new LinkedHashSet<>();
        for (InterstellarBody planet : planets) {
            moons.addAll(planet.getPlanetaryObjects());
        }
        System.out.println("All sub planetary objects : ");
        printSetElements(moons);
        System.out.println();

        System.out.println(solarSystem.get(
                InterstellarBody.makeKey("Pluto", BodyType.DWARF_PLANET)));

        System.out.println(solarSystem.get(
                InterstellarBody.makeKey("Pluto", BodyType.PLANET)));
    }

    private static void printSetElements(Collection<InterstellarBody> objectSet) {
        for (InterstellarBody planet : objectSet) {
            System.out.println("\t" + planet);
        }
    }
}
