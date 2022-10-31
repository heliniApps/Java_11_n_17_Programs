package main.java.com.academy;

public class Main {

    public static void main(String[] args) {

        SoccerTeam hawthorn = new SoccerTeam("Hawthorn", 78.9, 19);
        SoccerTeam swans = new SoccerTeam("Swans", 100.6, 20);
        SoccerTeam tigers = new SoccerTeam("Tigers", 56.5, 16);

        LeagueTable<SoccerTeam> vicLeague = new LeagueTable<>("VIC League");
        vicLeague.addTeam(hawthorn);
        vicLeague.addTeam(swans);
        vicLeague.addTeam(tigers);

        vicLeague.printLeagueBoard();
    }
}
