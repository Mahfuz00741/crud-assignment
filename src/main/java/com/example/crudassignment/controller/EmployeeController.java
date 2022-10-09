package com.example.crudassignment.controller;

import com.example.crudassignment.domain.Employee;
import com.example.crudassignment.dto.EmployeeDto;
import com.example.crudassignment.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "crud/employee/")
public class EmployeeController {

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    private final EmployeeService employeeService;

    @PostMapping(value = "save")
    private EmployeeDto save(@RequestBody EmployeeDto employeeDto) {
        return employeeService.saveEmp(employeeDto);
    }

    @PutMapping(value = "update")
    private EmployeeDto update(@RequestBody EmployeeDto employeeDto) {
        return employeeService.updateEmp(employeeDto);
    }

    @GetMapping(value = "find-one/{id}")
    private Employee findOne(@PathVariable Long id) {
        return employeeService.findOne(id);
    }

    @GetMapping(value = "find-all")
    private List<Employee> findAll() {
        return employeeService.findAll();
    }

    @DeleteMapping(value = "delete/{id}")
    private void delete(@PathVariable Long id) {
        employeeService.deleteEpm(id);
    }

}
