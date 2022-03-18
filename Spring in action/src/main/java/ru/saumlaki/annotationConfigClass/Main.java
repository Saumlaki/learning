package ru.saumlaki.annotationConfigClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.saumlaki.annotationConfigClass.config.SpringConfigClass;
import ru.saumlaki.annotationConfigClass.entity.Man;

public class Main {
    public static void main(String[] args) {

        //Первый вариант
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringConfigClass.class);
        ctx.refresh();
        ((Man) ctx.getBean("egorLitvinov")).sayHello();

        //Второй вариант
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig/SpringXMLConfig.xml");
        ((Man) context.getBean("egorLitvinov")).sayHello();
    }
}
