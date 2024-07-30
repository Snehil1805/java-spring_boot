package com.collection.employee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.collection.employee.model.Employee;

@Service
public class EmployeeService {

    Map<Integer,Employee> empMap = new HashMap<>();

    public List<Employee> getAllEmployees(){
        List<Employee> emp = new ArrayList<>(empMap.values());
        return emp;

    }
    public Employee getById(int id){
       return empMap.get(id);
    }
    public void addEmployee(Employee employee){
        empMap.put(employee.getEmployeeId(), employee);
    }
    

}
