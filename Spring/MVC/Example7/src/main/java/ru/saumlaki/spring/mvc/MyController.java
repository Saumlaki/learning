package ru.saumlaki.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.saumlaki.spring.Employee;

import javax.validation.Valid;

//Controller это специальный компонент
@Controller
public class MyController {

    @RequestMapping("/")
    public String showAskEmployeeDetails(Model model) {

        model.addAttribute("employee", new Employee());

        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "askEmployeeDetailsView";
        } else

            //Для того что бы showEmployeeDetailsView мог работать с employee добавляем @ModelAttribute("employee")
            return "showEmployeeDetailsView";
    }
}
