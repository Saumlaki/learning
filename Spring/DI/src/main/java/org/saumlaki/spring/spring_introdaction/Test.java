package org.saumlaki.spring.spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        //Инициализируем контейнер
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Получаем класс
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
