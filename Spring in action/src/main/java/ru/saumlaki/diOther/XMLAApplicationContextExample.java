package ru.saumlaki.diOther;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.saumlaki.di.entity.Juggler;
import ru.saumlaki.di.entity.interfaces.Performer;

public class XMLAApplicationContextExample {
    public static void main(String[] args) {
       ApplicationContext context= new ClassPathXmlApplicationContext("diOther/SpringXMLConfig.xml");

        System.out.println(((Dog) context.getBean("myDog")).getName());
    }
}
