package com.example.demo.service;

import com.example.demo.converter.TestConverter;
import com.example.demo.mappers.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final EmployeeRepository employeeRepository;
    private final TestConverter testConverter;

    @Autowired
    public TestService(EmployeeRepository employeeRepository, TestConverter testConverter) {
        this.employeeRepository = employeeRepository;
        this.testConverter = testConverter;
    }


    public String doSomething() {
        String result = employeeRepository.getAll();

        return result;
    }
}
