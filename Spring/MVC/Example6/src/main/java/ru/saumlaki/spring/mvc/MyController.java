package ru.saumlaki.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.saumlaki.spring.Employee;

//Controller это специальный компонент
@Controller
public class MyController {

    @RequestMapping("/")
    public String showAskEmployeeDetails(Model model) {

        model.addAttribute("employee", new Employee());

        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {

        //Для того что бы showEmployeeDetailsView мог работать с employee добавляем @ModelAttribute("employee")
        return "showEmployeeDetailsView";
    }
}
