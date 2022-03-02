package ru.saumlaki.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller это специальный компонент
@Controller
public class MyControllerFirst {

    @RequestMapping("/")
    public String showAskEmployeeDetails(Model model) {

        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(Model model) {

        return "showEmployeeDetailsView";
    }


}
