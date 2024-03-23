package com.academy.game;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", hitPoints=" + getHitPoints() +
                ", strength=" + getStrength() +
                ", weapon='" + getWeapon() + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, getName());
        values.add(1, String.valueOf(getHitPoints()));
        values.add(2, String.valueOf(getStrength()));
        values.add(3, getWeapon());
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if ((savedValues != null) && (savedValues.size() > 0)) {
            setName(savedValues.get(0));
            setHitPoints(Integer.parseInt(savedValues.get(1)));
            setStrength(Integer.parseInt(savedValues.get(2)));
            setWeapon(savedValues.get(3));
        }
    }
}
