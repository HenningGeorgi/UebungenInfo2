package Blatt8.Aufgabe3839b;

public class Match {
    private Team team1;
    private Team team2;
    private Team winner;

    public Match(Team team1, Team team2) throws IllegalArgumentException {
        if (team1.equals(team2)) throw new IllegalArgumentException();
        this.team1 = team1;
        this.team2 = team2;
    }
}
