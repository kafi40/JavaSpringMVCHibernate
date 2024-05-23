package ru.kafi.spring.dao;

import ru.kafi.spring.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
