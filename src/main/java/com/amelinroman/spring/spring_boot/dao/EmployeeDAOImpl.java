package com.amelinroman.spring.spring_boot.dao;

import com.amelinroman.spring.spring_boot.entity.Employee;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeDAOImpl implements EmployeeDAO {


    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {
        var newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void deleteEmployee(int id) {
        var query = entityManager
                .createQuery("delete from Employee where id =:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
