package main.java.com.academy;

public class BaseballTeam extends Team {

    public BaseballTeam(String name, double score, int gamesPlayed) {
        super(name, score, gamesPlayed);
    }

    @Override
    public double calcRanking() {
        return ((getScore() / 100) * getGamesPlayed());
    }
}
