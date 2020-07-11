package com.example.demo.converter;


import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TestConverter {

    String convert(String str);

}
