package ru.saumlaki.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.saumlaki.spring.Employee;

//Controller это специальный компонент
@Controller
public class MyControllerFirst {

    @RequestMapping("/")//employee/
    public String showAskEmployeeDetails(Model model) {

        model.addAttribute("employee", new Employee());

        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")////employee/showDetails
    public String showEmployeeDetails(@RequestParam("employeeName") String userName, @RequestParam("employeeAge")String userAge, Model model) {

        model.addAttribute("userName", userName += " mister");
        model.addAttribute("userAge", userAge);
        model.addAttribute("description", new Status("Обычный пользователь"));
        return "showEmployeeDetailsView";
    }
}
