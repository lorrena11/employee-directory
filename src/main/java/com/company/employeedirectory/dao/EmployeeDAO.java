package com.company.employeedirectory.dao;

import com.company.employeedirectory.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
