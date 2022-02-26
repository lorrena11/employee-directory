package com.company.employeedirectory.service;

import com.company.employeedirectory.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(Long id);

    public void save(Employee employee);

    public void deleteById(Long id);
}
