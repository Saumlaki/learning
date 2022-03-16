package ru.saumlaki.di.entity;

public class Scene {

    private static Scene scene;

    private Scene() {
    }

    public static Scene getInstance() {
        if(scene==null) scene = new Scene();

        return  scene;
    }
}
