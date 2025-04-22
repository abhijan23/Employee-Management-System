package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedemployee){
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee not found."));

        existingEmployee.setName(updatedemployee.getName());
        existingEmployee.setEmail((updatedemployee.getEmail()));
        existingEmployee.setJobTitle(updatedemployee.getJobTitle());
        existingEmployee.setDepartment(updatedemployee.getDepartment());
        existingEmployee.setPhone(updatedemployee.getPhone());
        existingEmployee.setImageUrl(updatedemployee.getImageUrl());
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found."));
    }
}
