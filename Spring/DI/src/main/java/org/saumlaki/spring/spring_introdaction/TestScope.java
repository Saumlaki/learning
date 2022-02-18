package org.saumlaki.spring.spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {

        //Инициализируем контейнер
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Singleton scope
        System.out.println("=================================");
        System.out.println("=Singleton scope=================");
        Pet pet1 = context.getBean("myPet", Pet.class);
        Pet pet2 = context.getBean("myPet", Pet.class);

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println("Это один и тот же объект - " + pet1.equals(pet2));

        //Prototype scope
        System.out.println("=================================");
        System.out.println("=Prototype scope=================");
        Pet petProto1= context.getBean("myPetProto", Pet.class);
        Pet petProto2 = context.getBean("myPetProto", Pet.class);

        System.out.println(petProto1);
        System.out.println(petProto2);
        System.out.println("Это один и тот же объект - " + petProto1.equals(petProto2));

        context.close();
    }


}
