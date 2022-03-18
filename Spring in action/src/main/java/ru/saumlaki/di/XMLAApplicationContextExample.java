package ru.saumlaki.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.saumlaki.di.entity.Juggler;
import ru.saumlaki.di.entity.interfaces.Performer;

public class XMLAApplicationContextExample {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("di/SpringXMLConfig.xml");

        Performer performerPit = (Juggler) context.getBean("pit");
        performerPit.perform();


        Performer performerGuv = (Juggler) context.getBean("guv");
        performerGuv.perform();
    }
}
