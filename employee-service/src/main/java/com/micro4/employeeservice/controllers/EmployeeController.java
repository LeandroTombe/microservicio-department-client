package com.micro4.employeeservice.controllers;


import com.micro4.employeeservice.models.Employee;
import com.micro4.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @PostMapping
    public Employee add(@RequestBody Employee employee){
        //LOGGER.info("Department add: {}"+ department);
        return employeeRepository.addDepartment(employee);
    }

    @GetMapping
    public List<Employee> findAll(){
        //LOGGER.info("Department find");
        return employeeRepository.findAll();
    }

    @GetMapping("/{idEmployee}")
    public Employee findById(@PathVariable long idEmployee){
        //LOGGER.info("Department find: id={}" + idDepartment);
        return  employeeRepository.findById(idEmployee);
    }

    @GetMapping("/department/{idDepartment}")
    public List<Employee> findByDepartment(@PathVariable long idDepartment){
        return employeeRepository.findByDepartament(idDepartment);
    }
}
