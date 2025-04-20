package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee updatedemployee);
    void deleteEmployee(Long id);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
}
