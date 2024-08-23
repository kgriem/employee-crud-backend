package com.cogent.employee_crud.controller;

import com.cogent.employee_crud.entity.Employee;
import com.cogent.employee_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/api/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>>getAllEmployees(){
        return new ResponseEntity<>(this.employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Employee>createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(this.employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee>updateEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(this.employeeService.updateEmployee(employee), HttpStatus.OK);
    }

    @DeleteMapping("id/{id}")
    public ResponseEntity<Boolean>deleteEmployee(@PathVariable("id") int id){
        return new ResponseEntity<>(this.employeeService.deleteEmployeeById(id), HttpStatus.OK);
    }

}
