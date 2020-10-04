package Proj2;

public class Table {

    // fields
    private String name;
    private Team[] teams;

    // constructors

    public Table(String name, int size) {
        this.name = name;
        this.teams = new Team[size];
    }

    // methods
    public void AddTeam(Team team) {
        this.teams[0] = team;
    }
}
