package com.example.crudassignment.dto;

import com.example.crudassignment.domain.Employee;
import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    private String code;
    private String name;
    private String dob;
    private Employee.Gender gender;
    private String mobile;
    private Long departmentId;
}
