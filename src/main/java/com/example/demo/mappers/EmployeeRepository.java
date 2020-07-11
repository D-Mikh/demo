package com.example.demo.mappers;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeRepository {
    String getAll();
}
