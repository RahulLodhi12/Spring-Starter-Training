package org.training;

public class Engineer {
    private String name;
    private String skills;
    private int salary;

    private Address address;

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", skills='" + skills + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    //Constructor for autowire="constructor"
    public Engineer(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Engineer: Name Setter..");
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        System.out.println("Engineer: Skills Setter..");
        this.skills = skills;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        System.out.println("Engineer: Salary Setter..");
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Engineer: Address setter..");
        this.address = address;
    }
}
