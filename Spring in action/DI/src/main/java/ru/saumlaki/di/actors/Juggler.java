package ru.saumlaki.di.actors;

import ru.saumlaki.di.interfaces.Performer;

/**
 * Класс описывает жонглера
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("Жонглер жонглирует с " + beanBags + " шарами");
    }
}
