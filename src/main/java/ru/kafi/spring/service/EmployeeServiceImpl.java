package ru.kafi.spring.service;

import org.springframework.transaction.annotation.Transactional;
import ru.kafi.spring.dao.EmployeeDAO;
import ru.kafi.spring.entity.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
