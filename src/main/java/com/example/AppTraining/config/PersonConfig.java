package com.example.AppTraining.config;

import com.example.AppTraining.service.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class PersonConfig {

    private final ApplicationContext applicationContext;

    @Bean
    public Mapper serviceMapper(@Value("${app.mapper.type}") String qualifier){
        return (Mapper) applicationContext.getBean(qualifier);
    }
}
