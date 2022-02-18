package org.saumlaki.spring.Annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("BearBin")//Данная анотация регистрирует бин
public class Bear implements Sayble {

    @Override
    public void say() {
        System.out.println("Grhhhh!!!");
    }
}
