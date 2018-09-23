package com.septjpaonetomany.springonetomany.repository;

import com.septjpaonetomany.springonetomany.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by abhi on 22/09/18.
 */
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {


    List<Employee> findByDepartmentId(Integer deptId);
}
