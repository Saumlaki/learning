package ru.saumlaki.spring;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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

