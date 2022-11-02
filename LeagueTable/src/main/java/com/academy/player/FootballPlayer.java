package main.java.com.academy.player;

public class FootballPlayer extends Player {

    private int totalGoals;

    public FootballPlayer(String name, int totalGoals) {
        super(name);
        this.totalGoals = totalGoals;
    }

    public void addGoals(int numOfGoals) {
        this.totalGoals += numOfGoals;
    }

    @Override
    public int getAllTimeScore() {
        return this.totalGoals;
    }

    @Override
    public int compareTo(Player player) {
        if (player == null) {
            return 0;
        }

        if (getAllTimeScore() > player.getAllTimeScore()) {
            return -1;
        } else if (getAllTimeScore() < player.getAllTimeScore()) {
            return 1;
        }
        return 0;
    }
}
