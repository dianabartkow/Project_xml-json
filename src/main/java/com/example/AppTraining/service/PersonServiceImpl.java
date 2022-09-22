package com.example.AppTraining.service;

import com.example.AppTraining.domain.Person;
import com.example.AppTraining.dto.PersonDto;
import com.example.AppTraining.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {


    public final PersonRepository personRepository;
    public final DtoMapper dtoMapper;

    @Override
    public List<PersonDto> getAllPersons() {
        return personRepository.findAll().stream().map(dtoMapper::mapPersonToDto).collect(Collectors.toList());
    }

    @Override
    public Optional<PersonDto> getPersonById(Integer id) {
     return   personRepository.findById(id).stream().map(dtoMapper::mapPersonToDto).findFirst();

    }

    @Override
    public void deleteById(Integer id) {
        personRepository.deleteById(id);

    }

    @Override
    public Person create(Person person) {
        //czy tutaj nie powinno być odniesienie do klasy mapującej String-> POJO??
        return personRepository.save(person);
    }
}
