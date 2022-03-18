package ru.saumlaki.annotationConfigClass.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**Человек генерирует события - подозвать собаку*/
public class Man {

    @Autowired
    Dog dog;


    public Man(int age, Dog dog) {
        this.dog = dog;
    }

    public void sayHello() {
        System.out.println("Я гуляю с " + dog.getName());
    }
}
