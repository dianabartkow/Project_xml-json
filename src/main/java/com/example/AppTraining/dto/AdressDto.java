package com.example.AppTraining.dto;

import com.example.AppTraining.domain.Person;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
@Data
public class AdressDto {

    private String country;
    private String city;
    private String postcode;
    private String HouseNumber;
    private Person person;
}
