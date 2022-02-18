package org.saumlaki.spring.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //Инициализируем контейнер
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        //Получаем класс
        Person person = context.getBean("PersonBin", Person.class);

        person.callYourPet();

        context.close();
    }
}
