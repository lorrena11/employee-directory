package com.company.employeedirectory.repository;

import com.company.employeedirectory.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllByFirstName(String firstName);
}
