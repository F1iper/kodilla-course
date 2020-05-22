package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Calculations {

    @Bean
    public Calculator createAction() {
        return new Calculator();
    }
}