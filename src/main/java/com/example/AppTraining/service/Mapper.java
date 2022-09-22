package com.example.AppTraining.service;

import com.example.AppTraining.dto.PersonDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;

public interface Mapper {

    ResponseEntity<PersonDto> map(String body) throws JsonProcessingException;
}
