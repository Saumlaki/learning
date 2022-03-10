package ru.saumlaki.spring.mvc_hibernate_aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saumlaki.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import ru.saumlaki.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
