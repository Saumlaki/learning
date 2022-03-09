package ru.saumlaki.spring.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)//Информация должна сохранятся вплоть до выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class)//Этот класс будет обрабатывать аннотацию
public @interface CheckEmail {
    public String value() default "xyz.com";
    public String message() default "Почта должна заканчиваться на xyz.com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};

}
