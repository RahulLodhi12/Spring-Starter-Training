package org.training;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnotationsEngineer {
    private String name;
    private String skills;

    @Autowired //if not used @Autowired, then address=null
    private Address address;

    @Override
    public String toString() {
        return "AnnotationsEngineer{" +
                "name='" + name + '\'' +
                ", skills='" + skills + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
