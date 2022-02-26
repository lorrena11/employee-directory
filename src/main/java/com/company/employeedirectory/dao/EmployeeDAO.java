package com.company.employeedirectory.dao;

import com.company.employeedirectory.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

    public Employee findById(Long id);

    public void save(Employee employee);

    public void deleteById(Long id);
}
