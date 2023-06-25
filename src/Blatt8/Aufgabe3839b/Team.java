package Blatt8.Aufgabe3839b;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private static ArrayList<String> usedNames = new ArrayList<>();
    private String name;
    private List<Player> players = new ArrayList<>();

    public Team(String name, ArrayList<Player> players) throws IllegalArgumentException {
        if (usedNames.contains(name)) throw new IllegalArgumentException("name already exists");
        this.name = name;
        usedNames.add(name);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players = players
                .stream()
                .filter(p -> !p.getName().equals(player.getName()))
                .toList();
    }

    public boolean equals(Object o) {
        if (o.getClass().getName().equals("Team")) {
            Team team = (Team) o;
            return team.name.equals(name);
        }
        return false;
    }
}
