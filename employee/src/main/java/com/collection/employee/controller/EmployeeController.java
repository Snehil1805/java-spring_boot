package com.collection.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PostExchange;

import com.collection.employee.model.Employee;
import com.collection.employee.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity <List<Employee>> getAllEmployees(){
        List<Employee> emp =  employeeService.getAllEmployees();
        return new ResponseEntity<>(emp,HttpStatus.OK);

    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee>getById(@PathVariable int id){
        return new ResponseEntity<>(employeeService.getById(id),HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity <> void addEmployee(@RequestBody Employee employee){

    }

    
}
