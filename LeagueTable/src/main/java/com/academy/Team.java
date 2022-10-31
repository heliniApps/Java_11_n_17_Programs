package main.java.com.academy;

abstract class Team implements Comparable<Team>{

    private String name;
    private double score;
    private int gamesPlayed;

    public Team(String name, double score, int gamesPlayed) {
        this.name = name;
        this.score = score;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public abstract double calcRanking();

    @Override
    public int compareTo(Team team) {
        if (team == null) {
            return 0;
        }
        double currentRanking = calcRanking();
        double opponentRanking = team.calcRanking();

        if (currentRanking < opponentRanking) {
            return 1;
        } else if (currentRanking > opponentRanking) {
            return -1;
        }
        return 0;
    }
}
