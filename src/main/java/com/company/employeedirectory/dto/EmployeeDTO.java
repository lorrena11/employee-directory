package com.company.employeedirectory.dto;

import com.company.employeedirectory.entity.Employee;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    public EmployeeDTO(Employee employee) {
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.email = employee.getEmail();
    }
}
