package org.training;

public class Superstar {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Superstar{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Superstar() {
    }

    public Superstar(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
