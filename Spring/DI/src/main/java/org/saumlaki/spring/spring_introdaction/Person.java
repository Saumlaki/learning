package org.saumlaki.spring.spring_introdaction;

public class Person {

    private Pet pet;
    private String Surname;
    private int age;
    private String name;
    private int weight;

    public Person() {
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setPet(Pet pet) {
        System.out.println("Мы добавили животное");
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", Surname='" + Surname + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
