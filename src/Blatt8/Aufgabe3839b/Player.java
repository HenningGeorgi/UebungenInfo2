package Blatt8.Aufgabe3839b;

public class Player {
    private String name;
    private Team team = null;

    public Player(String name, Team team) {
        this.name = name;
        setTeam(team);
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }
}
