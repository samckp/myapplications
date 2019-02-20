package com.sam.jpa.service;

import com.sam.jpa.dao.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> getEmployees();
}
