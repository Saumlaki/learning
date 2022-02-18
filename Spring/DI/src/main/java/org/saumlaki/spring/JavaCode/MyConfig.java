package org.saumlaki.spring.JavaCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Конфигурирование Spring Container с помощью Java кода
@Configuration
@PropertySource("myApp.properties")
public class MyConfig {

    @Bean
    public Cat catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
