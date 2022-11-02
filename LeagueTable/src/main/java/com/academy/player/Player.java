package main.java.com.academy.player;


public abstract class Player implements Comparable<Player> {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getAllTimeScore();

    @Override
    public abstract int compareTo(Player player);
}
