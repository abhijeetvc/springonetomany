package com.septjpaonetomany.springonetomany.controller;

import com.septjpaonetomany.springonetomany.model.Department;
import com.septjpaonetomany.springonetomany.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 22/09/18.
 */

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping(value="/savedept")
    public String addDept(@RequestBody Department department){

        departmentRepo.save(department);
        return "Success";
    }
}
