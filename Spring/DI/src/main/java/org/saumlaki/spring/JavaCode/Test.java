package org.saumlaki.spring.JavaCode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        //Указываем класс который содержит конфигурационные настройки
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = applicationContext.getBean("personBean", Person.class);
        System.out.println(person);
    }
}
