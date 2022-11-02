package main.java.com.academy.team;

import main.java.com.academy.player.Player;

public class BaseballTeam<T extends Player> extends Team<T> {

    public BaseballTeam(String name, double score, int gamesPlayed) {
        super(name, score, gamesPlayed);
    }

    @Override
    public double calcRanking() {
        return ((getScore() / 100) * getGamesPlayed());
    }
}
