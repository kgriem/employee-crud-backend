package com.cogent.employee_crud.service.impl;

import com.cogent.employee_crud.entity.Employee;
import com.cogent.employee_crud.repository.EmployeeRepository;
import com.cogent.employee_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return this.employeeRepository.findById(Long.valueOf(id));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        try{
            this.employeeRepository.deleteById(Long.valueOf(id));
        } catch(Exception e) {
            return false;
        } return true;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }
}
