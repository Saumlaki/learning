package ru.saumlaki.spring;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

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

    @Setter
    @Getter
    private String country;

    @Setter
    @Getter
    private String car;
    
    @Getter
    @Setter
    private String[] languages;

    @Getter
    @Setter
    Map<String, String> countryMap;

    public Employee() {

        countryMap = new HashMap<>();
        countryMap.put("Россия", "Rus");
        countryMap.put("Казахстан", "Kz");
    }
}

