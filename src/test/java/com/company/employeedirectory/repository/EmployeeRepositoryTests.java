package com.company.employeedirectory.repository;

import com.company.employeedirectory.entity.Employee;
import com.company.employeedirectory.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void findAll() {
        List<Employee> employees = employeeRepository.findAll();

        assertEquals(5, employees.size());
    }

    @Test
    public void findAllByFirstName() {
        List<Employee> employees = employeeRepository.findAllByFirstName("John");

        assertEquals(1, employees.size());
        assertEquals("John", employees.get(0).getFirstName());
    }
}
