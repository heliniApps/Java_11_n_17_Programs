package main.java.com.academy.team;

import main.java.com.academy.player.Player;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Team<T extends Player> implements Comparable<Team<T>>{

    private String name;
    private double score;
    private int gamesPlayed;
    private ArrayList<T> teamMembers;

    public Team(String name, double score, int gamesPlayed) {
        this.name = name;
        this.score = score;
        this.gamesPlayed = gamesPlayed;
        teamMembers = new ArrayList<>();
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

    public boolean addTeamMember(T player) {
        if (player == null) {
            return false;
        }
        if (teamMembers.contains(player)) {
            System.out.println("Player already exists in this Team.");
            return false;
        }
        return teamMembers.add(player);
    }

    public void printPlayerRanking() {
        Collections.sort(teamMembers);
        for (T player : teamMembers) {
            System.out.println("\t" + player.getName() + ", with score "
                    + player.getAllTimeScore());
        }
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
