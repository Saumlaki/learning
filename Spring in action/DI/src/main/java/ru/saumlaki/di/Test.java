package ru.saumlaki.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.saumlaki.di.interfaces.Performer;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.cfg.xml");
        Performer performer = (Performer) applicationContext.getBean("duke");
        performer.perform();
    }
}
