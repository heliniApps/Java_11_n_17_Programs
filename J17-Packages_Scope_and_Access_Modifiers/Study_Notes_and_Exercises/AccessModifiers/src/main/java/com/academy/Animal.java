package com.academy;

public class Animal {

    private String genre;
    private String species;
    private String typeOfFood;
    private String moveMechanism;

    public Animal(String genre, String species) {
        this.genre = genre;
        this.species = species;
        System.out.println(this.species + " is a " + this.genre + ".");
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getTypeOfFood() {
        return this.typeOfFood;
    }

    public String getMoveMechanism() {
        return this.moveMechanism;
    }

    protected void eat(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    protected void move(String moveMechanism) {
        this.moveMechanism = moveMechanism;
    }
}