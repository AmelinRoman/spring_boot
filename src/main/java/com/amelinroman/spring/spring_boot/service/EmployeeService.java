package com.amelinroman.spring.spring_boot.service;


import com.amelinroman.spring.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);
}
