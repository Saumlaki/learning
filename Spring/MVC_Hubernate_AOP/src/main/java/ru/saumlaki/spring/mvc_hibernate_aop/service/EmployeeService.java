package ru.saumlaki.spring.mvc_hibernate_aop.service;

import ru.saumlaki.spring.mvc_hibernate_aop.entity.Employee;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface EmployeeService {
    List<Employee> getAllEmployees();
}
