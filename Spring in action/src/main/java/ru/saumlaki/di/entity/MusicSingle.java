package ru.saumlaki.di.entity;

import ru.saumlaki.di.entity.interfaces.Singer;

public class MusicSingle implements Singer {

    String text = "Антошка, Антошка! Пойдем копать картошку!!!";
    @Override
    public void sing() {
        System.out.println(text);
    }
}
