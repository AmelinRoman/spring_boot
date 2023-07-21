package com.amelinroman.spring.spring_boot.dao;



import com.amelinroman.spring.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
