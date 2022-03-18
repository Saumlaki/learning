package ru.saumlaki.diOther;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


@Qualifier("myPet")
public class Dog {

    @Value("#{properties.dogName}")
    String name;

    public Dog(String name) {
        this.name = name;
    }
    public Dog() {
    }

    public String getName() {
        return name;
    }


}
