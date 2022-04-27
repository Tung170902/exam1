package com.example.exam1.exam.Exam.service;

import com.example.exam_spring.entity.Employees;
import com.example.exam_spring.model.EmployeesReposivetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    private EmployeesReposivetory employeesReposivetory;
    public List<Employees> findAll(){
        return employeesReposivetory.findAll();
    }
    public Employees save(Employees employees){
        return employeesReposivetory.save(employees);
    }
}
