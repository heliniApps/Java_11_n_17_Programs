package main.java.com.academy.team;

import main.java.com.academy.player.Player;

public class SoccerTeam<T extends Player> extends Team<T> {

    public SoccerTeam(String name, double score, int gamesPlayed) {
        super(name, score, gamesPlayed);
    }

    @Override
    public double calcRanking() {
        return ((getScore() / getGamesPlayed()) * 100);
    }
}
