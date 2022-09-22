package com.example.AppTraining.service;

import com.example.AppTraining.domain.Person;
import com.example.AppTraining.dto.PersonDto;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    List<PersonDto> getAllPersons();
    Optional<PersonDto> getPersonById(Integer id);
    void deleteById(Integer id);
    Person create(Person person);
}
