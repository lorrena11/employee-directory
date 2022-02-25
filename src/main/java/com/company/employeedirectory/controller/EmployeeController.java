package com.company.employeedirectory.controller;

import com.company.employeedirectory.dao.EmployeeDAO;
import com.company.employeedirectory.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeDAO employeeDAO;

    // inject employee dao (use constructor injection)
    public EmployeeController(EmployeeDAO theEmployeeDAO) {
        employeeDAO =  theEmployeeDAO;
    }

    // return list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
