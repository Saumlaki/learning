package ru.saumlaki.spring;

import lombok.Getter;
import lombok.Setter;
import ru.saumlaki.spring.annotation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Setter
    @Getter
    @Size(min = 3, max = 25, message = "Ошибка ввода имени. Имя должно быть от 2 до 25 символов")//Минимальная и максимальная длинна имени
    private String name;

    @Setter
    @Getter
    @NotBlank(message = "Поле должно быть заполнено")
    private String surname;

    @Setter
    @Getter
    @Min(value = 100, message = "Зарплата должна быть больше 100")
    @Max(value = 10_000, message = "Зарплата должна быть меньше 10 000")
    private int salary;

    @Setter
    @Getter
    private String department;

    @Setter
    @Getter
    private String country;

    @Setter
    @Getter
    private String car;

    @Setter
    @Getter
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Телефон должен быть в формате XXX-XX-XX")
    private String telephone;

    @Setter
    @Getter
    @CheckEmail(value = "abc.com", message = "Почта должна заканчиваться на abc.com")
    private String email;
    
    @Getter
    @Setter
    private String[] languages;

    @Getter
    @Setter
    Map<String, String> countryMap;

    public Employee() {

        countryMap = new HashMap<>();
        countryMap.put("Россия", "Rus");
        countryMap.put("Казахстан", "Kz");
    }
}

