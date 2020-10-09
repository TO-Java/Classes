package Proj2;

public class Game {

    private Team homeTeam;
    private Team awayTeam;

    private int homeGoals;
    private int awayGoals;

    public Game(Team homeTeam, Team awayTeam, int homeGoals, int awayGoals ) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.awayGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }
}
