package org.training;

public class IPL {
    private String sponsor;
    private int noOfTeams;
    private int prize;

    private Team team;

    @Override
    public String toString() {
        return "IPL{" +
                "sponsor='" + sponsor + '\'' +
                ", noOfTeams=" + noOfTeams +
                ", prize=" + prize +
                ", team=" + team +
                '}';
    }

//    public IPL() {
//    }

    public IPL(String sponsor, int noOfTeams, int prize, Team team) {
        this.sponsor = sponsor;
        this.noOfTeams = noOfTeams;
        this.prize = prize;
        this.team = team;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
