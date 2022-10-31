package com.academy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {

    private String name;
    private double score;
    private int numOfLives;
    private String weapon;

    public String getName() {
        return this.name;
    }

    public double getScore() {
        return score;
    }

    public int getNumOfLives() {
        return numOfLives;
    }

    public String getWeapon() {
        return weapon;
    }

    public Player(String name, double score, int numOfLives) {
        this.name = name;
        this.score = score;
        this.numOfLives = numOfLives;
        this.weapon = "Sword";
    }

    @Override
    public List<String> getObject() {
        ArrayList<String> objValues = new ArrayList<String>();
        objValues.add(getName().trim());
        objValues.add(String.valueOf(getScore()));
        objValues.add(String.valueOf(getNumOfLives()));
        objValues.add(getWeapon().trim());

        return objValues;
    }

    @Override
    public void loadObject(List<String> values) {

        if ((values == null) || (values.size() < 4)) {
            return;
        }
        this.name = values.get(0);
        this.score = Double.parseDouble(values.get(1));
        this.numOfLives = Integer.parseInt(values.get(2));
        this.weapon = values.get(3);
    }

    @Override
    public String toString() {
        return "Player { " +
                "name='" + name + '\'' +
                ", score=" + score +
                ", numOfLives=" + numOfLives +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
