package ru.saumlaki.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller это специальный компонент
@Controller
public class MyControllerFirst {

    @RequestMapping("/")
    public String showMainView1() {

        return "mainView";
    }

    @RequestMapping("/1")
    public String showFirstView() {

        return "firstView";
    }

    @RequestMapping("/2")
    public String showSecondView() {

        return "secondView";
    }

}
