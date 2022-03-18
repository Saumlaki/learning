package ru.saumlaki.annotationConfigClass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.saumlaki.annotationConfigClass.entity.Dog;
import ru.saumlaki.annotationConfigClass.entity.Man;


@Configuration
public class SpringConfigClass {

    @Bean
    public Dog charli() {
        return new Dog("Чарли");
    }

    @Bean("egorLitvinov")
    public Man EgorLitvinov() {
        return new Man(55, charli());
    }
}
