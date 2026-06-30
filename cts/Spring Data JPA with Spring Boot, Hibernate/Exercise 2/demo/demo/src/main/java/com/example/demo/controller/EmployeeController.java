package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService service;


    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee){

        service.addEmployee(employee);

        return "Employee Added Successfully";
    }

}