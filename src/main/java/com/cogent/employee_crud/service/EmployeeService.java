package com.cogent.employee_crud.service;

import com.cogent.employee_crud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Optional<Employee> getEmployeeById(int id);
    public List<Employee> getAllEmployees();
    public Employee createEmployee(Employee employee);
    public boolean deleteEmployeeById(int id);
    public Employee updateEmployee(Employee employee);
}
