package ru.saumlaki.di.entity;

/**
 * Класс описывает сцену. Сцена является singleton поэтому ее инициализация происходит через factory-method
 */
public class Scene {

    private static Scene scene;

    private Scene() {
    }

    public static Scene getInstance() {
        if (scene == null) scene = new Scene();

        return scene;
    }
}
