package com.micro4.employeeservice.repositories;


import com.micro4.employeeservice.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();


    public Employee addDepartment(Employee employee){
        employees.add(employee);

        return employee;
    }

    public Employee findById(Long idEmployee){
        return employees.stream()
                .filter(department -> department.id().equals(idEmployee))
                .findFirst()
                .orElseThrow();

    }

    public List<Employee> findAll(){
        return employees;
    }


    public List<Employee> findByDepartament(Long idDepartment){
        return employees.stream()
                .filter(employee -> employee.departmentId().equals(idDepartment))
                .toList();
    }
}
