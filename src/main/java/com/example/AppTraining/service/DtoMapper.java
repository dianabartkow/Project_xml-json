package com.example.AppTraining.service;

import com.example.AppTraining.domain.Adress;
import com.example.AppTraining.domain.Person;
import com.example.AppTraining.dto.AdressDto;
import com.example.AppTraining.dto.PersonDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.mappers.ModelMapper;

@Service
@RequiredArgsConstructor
public class DtoMapper {

    private ModelMapper mapper;

    public PersonDto mapPersonToDto(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setName(person.getName());
        personDto.setSurename(person.getSureName());
        personDto.setListOfAdress(person.getListOfAdress());
        return personDto;
    }

    public AdressDto mapAdressToDto(Adress adress) {
        AdressDto adressDto = new AdressDto();
        adressDto.setCity(adress.getCity());
        adressDto.setCountry(adress.getCountry());
        adressDto.setHouseNumber(adress.getHouseNumber());
        adressDto.setPostcode(adress.getPostcode());
        adressDto.setPerson(adress.getPerson());
        return adressDto;

    }
}
