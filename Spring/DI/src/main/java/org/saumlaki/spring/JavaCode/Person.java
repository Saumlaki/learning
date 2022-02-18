package org.saumlaki.spring.JavaCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.PropertyResolver;
import org.springframework.stereotype.Component;


public class Person {

    private Cat cat;
    @Value("${person.name}")
    private String name;


    public Person(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" + name +
                "cat=" + cat +
                '}';
    }
}
