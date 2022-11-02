package main.java.com.academy.team;

import main.java.com.academy.player.BaseballPlayer;

public class BaseballTeam<T extends BaseballPlayer> extends Team<T> {

    public BaseballTeam(String name, double score, int gamesPlayed) {
        super(name, score, gamesPlayed);
    }

    @Override
    public double calcRanking() {
        return ((getScore() / 100) * getGamesPlayed());
    }
}
