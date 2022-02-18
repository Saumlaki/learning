package org.saumlaki.spring.spring_introdaction;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow!!!");
    }

    public Dog() {
        System.out.println("Создали обхект Dog");
    }

    public void init() {
        System.out.println("Class Dog: init method ");

    }

    public void destroy() {
        System.out.println("Class Dog: destroy method ");
    }
}
