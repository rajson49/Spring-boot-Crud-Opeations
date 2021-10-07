package com.example.spring_backend.controller;

import com.example.spring_backend.CSVHelper;
import com.example.spring_backend.ResponseMessage;
import com.example.spring_backend.exceptions.ResouceNotFoundExceptions;
import com.example.spring_backend.model.UniversityCourses;
import com.example.spring_backend.repository.UniversityCoursesRepository;
import com.example.spring_backend.services.CSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class UniversityCoursesController {


    @Autowired
    private UniversityCoursesRepository universitycoursesRepository;

    // get all employees

    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees")
    public List<UniversityCourses> getAllEmployees(){
        return universitycoursesRepository.findAll();
    }

    //create employee rest api
    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/employees")
    public UniversityCourses createEmployee(@RequestBody UniversityCourses employee){
        return universitycoursesRepository.save(employee);
    }

    // find employee by id
    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees/{id}")
    public ResponseEntity<UniversityCourses> getEmployeeById(@PathVariable Long id){
        UniversityCourses employee= universitycoursesRepository.findById(id)
                .orElseThrow(()->new ResouceNotFoundExceptions("Employee Does not exist with this id = "+id));
        return ResponseEntity.ok(employee);
    }


    //update  employee rest api
    //@CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/employees/{id}")
    public ResponseEntity<UniversityCourses> updateEmployee(@PathVariable Long id, @RequestBody UniversityCourses employeeDetails){
        UniversityCourses employee= universitycoursesRepository.findById(id)
                .orElseThrow(()->new ResouceNotFoundExceptions("Employee Does not exist with this id = "+id));

        employee.setFirst_name(employeeDetails.getFirst_name());
        employee.setLast_name(employeeDetails.getLast_name());
        employee.setEmail_id(employeeDetails.getEmail_id());
        UniversityCourses updateEmployee= universitycoursesRepository.save(employee);
        return ResponseEntity.ok(updateEmployee);
    }

    //delete employee rest api
    //@CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id){
       UniversityCourses employee= universitycoursesRepository.findById(id)
                .orElseThrow(()->new ResouceNotFoundExceptions("Employee Does not exist with this id = "+id));

       universitycoursesRepository.delete(employee);
       Map<String,Boolean> response=new HashMap<>();
       response.put("deleted",Boolean.TRUE);
       return  ResponseEntity.ok(response);
    }


}
