package ru.saumlaki.diOther;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;

/**Человек генерирует события - подозвать собаку*/
public class Man {

    @Autowired
    @Qualifier("myPet")
    Dog dog;
    @Autowired
    Integer age;


    public Man() {
    }
    @Autowired

    public Man(Integer age, Dog dog) {
        this.age = age;
        this.dog = dog;
    }

    @Autowired(required = false)
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Я гуляю с " + dog.getName());
    }
}
