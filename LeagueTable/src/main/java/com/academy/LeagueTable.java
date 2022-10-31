package main.java.com.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Team> {

    private String leagueName;
    private List<T> teams = new ArrayList<>();

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public List<T> getTeams() {
        return teams;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("Team already exists in the league table.");
            return false;
        }
        return teams.add(team);
    }

    public void printLeagueBoard() {
        Collections.sort(teams);
        for (Team t : teams) {
            System.out.println(t.getName());
        }
    }

}
