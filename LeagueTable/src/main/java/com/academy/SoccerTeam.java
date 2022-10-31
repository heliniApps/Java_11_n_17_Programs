package main.java.com.academy;

public class SoccerTeam extends Team {

    public SoccerTeam(String name, double score, int gamesPlayed) {
        super(name, score, gamesPlayed);
    }

    @Override
    public double calcRanking() {
        return ((getScore() / getGamesPlayed()) * 100);
    }
}
