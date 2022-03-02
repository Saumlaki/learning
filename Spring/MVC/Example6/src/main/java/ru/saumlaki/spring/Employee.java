package ru.saumlaki.spring;

import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.Target;

public class Employee {

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String surname;

    @Setter
    @Getter
    private int salary;

    @Setter
    @Getter
    private String department;

    public Employee() {
    }
}
