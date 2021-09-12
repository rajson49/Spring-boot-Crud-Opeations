package com.example.spring_backend.controller;

import com.example.spring_backend.exceptions.ResouceNotFoundExceptions;
import com.example.spring_backend.model.Employee;
import com.example.spring_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class EmplyeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // get all employees

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }

    //create employee rest api
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    // find employee by id
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()->new ResouceNotFoundExceptions("Employee Does not exist with this id = "+id));
        return ResponseEntity.ok(employee);
    }


    //update  employee rest api
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails){
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()->new ResouceNotFoundExceptions("Employee Does not exist with this id = "+id));

        employee.setFirst_name(employeeDetails.getFirst_name());
        employee.setLast_name(employeeDetails.getLast_name());
        employee.setEmail_id(employeeDetails.getEmail_id());

        Employee updateEmployee=employeeRepository.save(employee);
        return ResponseEntity.ok(updateEmployee);
    }

    //delete employee rest api
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id){
       Employee employee=employeeRepository.findById(id)
                .orElseThrow(()->new ResouceNotFoundExceptions("Employee Does not exist with this id = "+id));

       employeeRepository.delete(employee);
       Map<String,Boolean> response=new HashMap<>();
       response.put("deleted",Boolean.TRUE);
       return  ResponseEntity.ok(response);
    }

}
