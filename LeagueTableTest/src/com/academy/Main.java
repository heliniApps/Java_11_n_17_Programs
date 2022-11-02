package com.academy;

import main.java.com.academy.LeagueTable;
import main.java.com.academy.player.FootballPlayer;
import main.java.com.academy.team.SoccerTeam;
import main.java.com.academy.team.Team;

public class Main {

    public static void main(String[] args) {

        SoccerTeam<FootballPlayer> hawthorn = new SoccerTeam<>("Hawthorn", 78.9, 19);
        hawthorn.addTeamMember(new FootballPlayer("Tim", 13));
        hawthorn.addTeamMember(new FootballPlayer("John", 15));

        Team<FootballPlayer> swans = new SoccerTeam<>("Swans", 100.6, 20);
        swans.addTeamMember(new FootballPlayer("Peter", 18));
        swans.addTeamMember(new FootballPlayer("James", 10));

        Team<FootballPlayer> tigers = new SoccerTeam<>("Tigers", 56.5, 16);
        tigers.addTeamMember(new FootballPlayer("Andrew", 12));

        LeagueTable<Team<FootballPlayer>> vicLeague = new LeagueTable<>("VIC League");
        vicLeague.addTeam(hawthorn);
        vicLeague.addTeam(swans);
        vicLeague.addTeam(tigers);

        vicLeague.printLeagueBoard(true);
    }
}
