package com.example.AppTraining.service;

import com.example.AppTraining.domain.Person;
import com.example.AppTraining.dto.PersonDto;
import com.example.AppTraining.repo.PersonRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("xmlMapper")
@RequiredArgsConstructor
public class XmlMapper implements Mapper{

    private final FileReader fileReader;
    private final ObjectMapper xmlMapper;
    private final PersonRepository personRepository;


    @Override
    public ResponseEntity<PersonDto> map(String body) throws JsonProcessingException {
        personRepository.save(xmlMapper.readValue(body, Person.class));

        return null;
    }
}
