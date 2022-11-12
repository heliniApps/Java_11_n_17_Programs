package com.academy.solarsystem;

import com.academy.enums.BodyType;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class InterstellarBody {

    private final Key key;
    private final double orbitalPeriod;
    private final Set<InterstellarBody> planetaryObjects;

    public InterstellarBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.planetaryObjects = new LinkedHashSet<>();
    }

    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public Key getKey() {
        return this.key;
    }

    public Set<InterstellarBody> getPlanetaryObjects() {
        return new LinkedHashSet<>(this.planetaryObjects);
    }

    public boolean addPlanetaryObject(InterstellarBody planetaryObject) {
        return this.planetaryObjects.add(planetaryObject);
    }

    public static Key makeKey(String name, BodyType bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
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
        return this.key.equals(compareObj.getKey());
    }

    @Override
    public String toString() {
        return String.format("%1$s: %2$s , %3$.2f", getKey().getName(),
                getKey().getBodyType(), getOrbitalPeriod());
    }

    public static final class Key {

        private final String name;
        private final BodyType bodyType;

        private Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object keyObj) {
            if (this == keyObj) {
                return true;
            }
            if ((keyObj == null) || (keyObj.getClass() != this.getClass())) {
                return false;
            }

            Key compareKey = (Key) keyObj;
            return ((this.name.equals(compareKey.getName()))
                    && (this.bodyType.equals(compareKey.getBodyType())));

        }

        @Override
        public int hashCode() {
            return (this.name.hashCode() + this.bodyType.hashCode() + 8);
        }

        @Override
        public String toString() {
            return String.format("%1$s:%2$s", getName(), getBodyType());
        }
    }
}
