package ru.saumlaki.spring;

public class Status {

    String name;

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return "-->" + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
