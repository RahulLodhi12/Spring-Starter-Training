package org.training;

import java.util.List;

public class WWE {
    private String sponsor;
    private String event;

    private List<Superstar> superstars;

    @Override
    public String toString() {
        return "WWE{" +
                "sponsor='" + sponsor + '\'' +
                ", event='" + event + '\'' +
                ", superstars=" + superstars +
                '}';
    }

    public WWE() {
    }

    public WWE(String sponsor, String event, List<Superstar> superstars) {
        this.sponsor = sponsor;
        this.event = event;
        this.superstars = superstars;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public List<Superstar> getSuperstars() {
        return superstars;
    }

    public void setSuperstars(List<Superstar> superstars) {
        this.superstars = superstars;
    }

    public void callAtStart(){
        System.out.println("Call At Start..");
    }

    public void callAtEnd(){ //it calls when then context is closed i.e. context.close()
        System.out.println("Call At End..");
    }
}
