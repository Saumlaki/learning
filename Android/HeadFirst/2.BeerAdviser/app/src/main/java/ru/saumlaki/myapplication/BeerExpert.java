package ru.saumlaki.myapplication;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {

        List<String> brands = new ArrayList();

        if (color.equals("Светлое")) {
            brands.add("Жигулёвское");
            brands.add("Балтика 9");
        }
        if (color.equals("Тёмное")) {
            brands.add("Жигулёвское тёмное");
            brands.add("Балтика тёмное");
        }
        if (color.equals("Живое")) {
            brands.add("Наш розлив");
            brands.add("Питерски медведь");
        }
        if (color.equals("Без алкогольное")) {
            brands.add("Балтика 0");
            brands.add("Мажор-тайм");
        }
        return brands;
    }
}
