package com.company.employeedirectory.service;

import com.company.employeedirectory.entity.Employee;
import com.company.employeedirectory.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public List<Employee> findAll(String firstName) {
        if (firstName != null) {
            return employeeRepository.findAllByFirstName(firstName);
        } else return employeeRepository.findAll();
    }


    public Employee findById(Long id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee = null;
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Did not find employee id - " + id);
        }
    }


    public void save(Employee employee) {
        employeeRepository.save(employee);
    }


    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
