package org.saumlaki.spring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("PersonBin")
@Scope("singleton")
public class Person {

    @Value("${person.name}")
    String name;
    //@Value("&{person.age}")
   // int age;
    //   @Autowired
//    @Qualifier("TigerBin")
    Sayble sayble;


    public void intit() {

    }

    @Autowired
    public Person(@Qualifier("TigerBin") Sayble sayble) {
        this.sayble = sayble;
    }


//    @Autowired
//    public void setTiger(Tiger tiger) {
//        System.out.println("Class Person set tiger");
//        this.tiger = tiger;
//    }

    public void callYourPet() {
        System.out.println(name);
        System.out.println("My pet say");
        sayble.say();
    }
}
