package com.example.AppTraining.service;

import com.example.AppTraining.domain.Person;
import com.example.AppTraining.dto.PersonDto;
import com.example.AppTraining.repo.PersonRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("jsonMapper")
@RequiredArgsConstructor
public class JsonMapper implements Mapper{

    private final FileReader fileReader;
    private final ObjectMapper jsonMapper;
    private final PersonRepository personRepository;


    @Override
    public ResponseEntity<PersonDto> map(String body) throws JsonProcessingException {
        personRepository.save(jsonMapper.readValue(body, Person.class));
        return null;
    }
}
