package com.example.demo;

import com.example.demo.converter.TestConverter;
import com.example.demo.mappers.EmployeeRepository;
import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    TestService testService;

    @MockBean
    EmployeeRepository employeeRepository;

    @MockBean
    TestConverter testConverter;

    @Test
    void contextLoads() {
        when(employeeRepository.getAll()).thenReturn("nope, it's not working:((");
        testService.doSomething();
    }

}
