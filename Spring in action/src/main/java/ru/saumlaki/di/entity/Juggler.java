package ru.saumlaki.di.entity;

import ru.saumlaki.di.entity.interfaces.Performer;
import ru.saumlaki.di.entity.interfaces.Singer;

/**
 * Класс описывающий жонглера. Жонглеру устанавливаем различными способами разные параметры
 */
public class Juggler implements Performer {

    public int beanBags = 3;
    public int time = 1;
    public Singer singer;
    public Scene scene;
    public boolean isEmailConform;

    public Juggler() {
    }

    public Juggler(int beanBags, Singer singer, Scene scene) {
        this.beanBags = beanBags;
        this.singer = singer;
        this.scene = scene;
    }

    @Override
    public void perform() {
        System.out.println("Жонглирую " + beanBags + " шарами " + time + " минут!");
        singer.sing();
    }

    public void setBeanBags(int beanBags) {
        this.beanBags = beanBags;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setEmailConform(boolean emailConform) {
        isEmailConform = emailConform;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
}
