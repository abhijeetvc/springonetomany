package com.septjpaonetomany.springonetomany.repository;

import com.septjpaonetomany.springonetomany.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by abhi on 22/09/18.
 */
public interface DepartmentRepo extends JpaRepository<Department,Integer> {



}
