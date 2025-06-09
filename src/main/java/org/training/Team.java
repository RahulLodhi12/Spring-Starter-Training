package org.training;

public class Team {
    private String name;
    private int squadSize;

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", squadSize=" + squadSize +
                '}';
    }

    public Team(String name, int squadSize) {
        this.name = name;
        this.squadSize = squadSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquadSize() {
        return squadSize;
    }

    public void setSquadSize(int squadSize) {
        this.squadSize = squadSize;
    }
}
