package com.academy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {

    private String name;
    private double score;
    private int strength;
    private String feature;

    public Monster(String name, double score, int strength) {
        this.name = name;
        this.score = score;
        this.strength = strength;
        this.feature = "claws";
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public int getStrength() {
        return strength;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public List<String> getObject() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(getName().trim());
        values.add(String.valueOf(getScore()));
        values.add(String.valueOf(getStrength()));
        values.add(getFeature());

        return values;
    }

    @Override
    public void loadObject(List<String> values) {

        if ((values == null) || (values.size() < 4)) {
            return;
        }
        this.name = values.get(0).trim();
        this.score = Double.parseDouble(values.get(1));
        this.strength = Integer.parseInt(values.get(2));
        this.feature = values.get(3).trim();
    }

    @Override
    public String toString() {
        return "Monster { " +
                "name='" + name + '\'' +
                ", score=" + score +
                ", strength=" + strength +
                ", feature='" + feature + '\'' +
                '}';
    }
}
