package com.example.crudassignment.service;

import com.example.crudassignment.domain.Employee;
import com.example.crudassignment.dto.EmployeeDto;
import com.example.crudassignment.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDto saveEmp(EmployeeDto employeeDto) {
        Employee emp = new Employee();
        BeanUtils.copyProperties(employeeDto, emp);
        employeeRepository.save(emp);

        return employeeDto;
    }

    public EmployeeDto updateEmp(EmployeeDto employeeDto) {
        Optional<Employee> employee = employeeRepository.findById(employeeDto.getId());
        Employee emp = employee.get();
        BeanUtils.copyProperties(employeeDto, emp);
        employeeRepository.save(emp);

        return employeeDto;
    }

    public Employee findOne(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        Employee emp = employee.get();

        return emp;
    }

    public List<Employee> findAll() {
        List<Employee> employee = employeeRepository.findAll();

        return employee;
    }

    public void deleteEpm(Long id) {
        employeeRepository.deleteById(id);
    }

}
