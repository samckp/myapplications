package com.sam.jpa.service.impl;

import com.sam.jpa.dao.Employee;
import com.sam.jpa.repository.EmployeeRepository;
import  com.sam.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {

        List<Employee> emps = employeeRepository.findAll();
        return emps;
    }
}
