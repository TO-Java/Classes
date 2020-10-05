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
        this .name = name;
        points = 0;
        wins = 0;
        losses = 0;
        draws = 0;
    }

    public String getName() {
        return name;
    }
}
