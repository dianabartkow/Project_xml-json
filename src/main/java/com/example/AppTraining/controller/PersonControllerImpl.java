package com.example.AppTraining.controller;

import com.example.AppTraining.domain.Person;
import com.example.AppTraining.dto.PersonDto;
import com.example.AppTraining.service.DtoMapper;
import com.example.AppTraining.service.Mapper;
import com.example.AppTraining.service.PersonServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonControllerImpl  {


    private final DtoMapper dtoMapper;
    private final PersonServiceImpl personServiceImpl;
    @Qualifier("xmlMapper")
    private final Mapper mapper;


    public ResponseEntity<Person> createPerson(@Qualifier("mapperService") Mapper mapper, String path) throws JsonProcessingException {
        mapper.map(path);
        //mapper odpowiada za mapowanie objektów z xmla/jsona
        // więc jak się tutaj odnieść do metody create z PersonServiceImpl gdzie ten "person" zapisywany do DB
        //ale argumentem tej metody jest obiekt Person
        return ResponseEntity.ok().build();
    }

    public void deletePersonById(Integer id)  {
        personServiceImpl.deleteById(id);
        ResponseEntity.ok().build();
    }

    public ResponseEntity<PersonDto> getPersonById(Integer id) {
        personServiceImpl.getPersonById(id);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<List<PersonDto>> getAll() {
        personServiceImpl.getAllPersons();
        return ResponseEntity.ok().build();
    }

}
