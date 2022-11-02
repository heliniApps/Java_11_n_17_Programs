package main.java.com.academy.team;

import main.java.com.academy.player.FootballPlayer;

public class SoccerTeam<T extends FootballPlayer> extends Team<T> {

    public SoccerTeam(String name, double score, int gamesPlayed) {
        super(name, score, gamesPlayed);
    }

    @Override
    public double calcRanking() {
        return ((getScore() / getGamesPlayed()) * 100);
    }
}
