package org.saumlaki.spring.spring_introdaction;

import org.saumlaki.spring.spring_introdaction.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    public static void main(String[] args) {

        //Инициализируем контейнер
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Получаем класс
        Person person = context.getBean("myPerson", Person.class);
        person.callYouPet();

        System.out.println(person);

        context.close();
    }
}
