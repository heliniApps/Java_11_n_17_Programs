package com.academy.solarsystem;

import com.academy.enums.BodyType;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class InterstellarBody {

    private final String name;
    private final double orbitalPeriod;
    private final BodyType bodyType;
    private final String key;
    private final Set<InterstellarBody> planetaryObjects;

    public InterstellarBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.key = makeKey(this.name, this.bodyType);
        this.planetaryObjects = new LinkedHashSet<>();
    }

    public static String makeKey(String name, BodyType bodyType) {
        return String.format("%1$s:%2$s", name.toUpperCase().trim(), bodyType);
    }

    public String getName() {
        return this.name;
    }

    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public BodyType getBodyType() {
        return this.bodyType;
    }

    public String getKey() {
        return this.key;
    }

    public Set<InterstellarBody> getPlanetaryObjects() {
        return new LinkedHashSet<>(planetaryObjects);
    }

    public boolean addPlanetaryObject(InterstellarBody planetaryObject) {
        return this.planetaryObjects.add(planetaryObject);
    }

    @Override
    public final int hashCode() {
        return (this.name.hashCode() + this.bodyType.hashCode() + 8);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterstellarBody)) {
            return false;
        }

        InterstellarBody compareObj = (InterstellarBody) obj;
        if ((this.name.equals(compareObj.getName()))
                && (this.bodyType.equals(compareObj.getBodyType()))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%1$s: %2$s , %3$.2f", getName(), getBodyType(),
                getOrbitalPeriod());
    }
}
