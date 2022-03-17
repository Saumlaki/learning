package ru.saumlaki.di.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**Класс описывает певца который, поет разные песни*/
public class Singer {

    List<MusicSingle> list;
    Map<String, MusicSingle> map;
    Properties prop;

    public void setList(List<MusicSingle> list) {
        this.list = list;
    }

    public void setMap(Map<String, MusicSingle> map) {
        this.map = map;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
