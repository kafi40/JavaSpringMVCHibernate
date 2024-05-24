package ru.kafi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kafi.spring.dao.EmployeeDAO;
import ru.kafi.spring.entity.Employee;
import ru.kafi.spring.service.EmployeeService;

import java.util.List;

@Controller
public class MyController {
    private final EmployeeService employeeService;

    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", employees);
        return "all-employees";
    }


}
