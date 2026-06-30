package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {


@Autowired
EmployeeRepository repository;


public void addEmployee(Employee employee){

    repository.save(employee);

}

}