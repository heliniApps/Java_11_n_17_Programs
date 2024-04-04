package com.academy._final.methods;

public class Animal {

    private final String genre;
    private final String species;

    public Animal(String genre, String species) {
        this.genre = genre;
        this.species = species;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getSpecies() {
        return this.species;
    }

    /*
     * This method is marked "final".
     * This CANNOT be overridden from any of the subclasses of this 'Animal' Class.
     */
    public final void move() {
        System.out.println(getGenre() + "s can move from place to place.");
    }

    public void eat() {
        System.out.println(getGenre() + "s eat food.");
    }

    /*
     * "private" methods Vs. marking method as "final"
     *
     * 'private' methods/members are only accessible within the declared Class.
     * They are not visible in subclasses or any other external classes.
     *
     * When a method has 'public' access and, it is marked as "final",
     * method can be accessed from subclasses and other external classes.
     * But, it restricts the subclass's ability to 'override' the method and change its behaviour.
     */
    private boolean buildNests() {
        return getGenre().equals("Bird");
    }
}
