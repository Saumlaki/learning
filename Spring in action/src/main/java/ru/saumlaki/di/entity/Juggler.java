package ru.saumlaki.di.entity;

import ru.saumlaki.di.entity.interfaces.Performer;
import ru.saumlaki.di.entity.interfaces.Singer;

/**Класс описывающий жонглера*/
public class Juggler implements Performer {

    private int beanBags = 3;
    private int time = 1;
    private Singer singer;
    private Scene scene;

    public Juggler() {
    }

    public Juggler(int beanBags, Singer singer, Scene scene) {
        this.beanBags = beanBags;
        this.singer= singer;
        this.scene= scene;
    }

    @Override
    public void perform() {
        System.out.println("Жонглирую " + beanBags + " шарами " + time + " минут!" );
        singer.sing();
    }
}
