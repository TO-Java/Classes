package Proj2;

public class Team {

    // fields
    private String name;
    private int points;
    private int wins;
    private int losses;
    private int draws;

    // constructors
    public Team(String name) {
        this.name = name;
        points = 0;
        wins = 0;
        losses = 0;
        draws = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
