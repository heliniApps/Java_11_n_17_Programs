package main.java.com.academy.player;

public class BaseballPlayer extends Player {

    private int totalScore;

    public BaseballPlayer(String name, int totalScore) {
        super(name);
        this.totalScore = totalScore;
    }

    public void addToScore(int score) {
        this.totalScore += score;
    }

    @Override
    public int getAllTimeScore() {
        return this.totalScore;
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
