package com.example.exam1.exam.model;

import com.example.exam_spring.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesReposivetory extends JpaRepository<Employees,Integer>{

}
