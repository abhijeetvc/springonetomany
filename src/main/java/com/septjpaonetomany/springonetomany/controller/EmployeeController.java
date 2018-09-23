package com.septjpaonetomany.springonetomany.controller;

import com.septjpaonetomany.springonetomany.model.Employee;
import com.septjpaonetomany.springonetomany.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by abhi on 22/09/18.
 */

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/saveemp")
    public String saveEmp(@RequestBody Employee employee){

        employeeRepo.save(employee);

        return "Success";
    }

    @GetMapping(value="/getEmp/{deptId}")
    public List<Employee> getEmployeess(@PathVariable Integer deptId){

        List<Employee> list=employeeRepo.findByDepartmentId(deptId);

        return list;

    }
}
