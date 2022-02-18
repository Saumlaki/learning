package org.saumlaki.spring.Annotation;

import org.springframework.stereotype.Component;

@Component("TigerBin")//Данная анотация регистрирует бин
public class Tiger implements Sayble {

    @Override
    public void say() {
        System.out.println("RRR!");
    }
}
