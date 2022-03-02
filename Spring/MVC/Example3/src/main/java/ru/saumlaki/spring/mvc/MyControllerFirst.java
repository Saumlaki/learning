package ru.saumlaki.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.saumlaki.spring.Status;

import javax.servlet.http.HttpServletRequest;

//Controller это специальный компонент
@Controller
public class MyControllerFirst {

    @RequestMapping("/")
    public String showAskEmployeeDetails(Model model) {

        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model) {

        String name = request.getParameter("employeeName");

        model.addAttribute("userName", name += " mister");
        model.addAttribute("description", new Status("Обычный пользователь"));
        return "showEmployeeDetailsView";
    }
}
