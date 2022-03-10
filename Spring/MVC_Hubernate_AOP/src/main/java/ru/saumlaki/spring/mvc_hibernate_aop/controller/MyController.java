package ru.saumlaki.spring.mvc_hibernate_aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.saumlaki.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import ru.saumlaki.spring.mvc_hibernate_aop.entity.Employee;
import ru.saumlaki.spring.mvc_hibernate_aop.service.EmployeeService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String ShowAllEmployees(Model model) {

       List<Employee> allEmployee = employeeService.getAllEmployees();
       model.addAttribute("allEmps", allEmployee);
       return "AllEmployees";
    }
}
