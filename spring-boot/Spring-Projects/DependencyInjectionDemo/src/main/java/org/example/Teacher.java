package org.example;

public class Teacher implements Staff {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public void work() {
        System.out.println("Teacher is teaching");
    }
}
