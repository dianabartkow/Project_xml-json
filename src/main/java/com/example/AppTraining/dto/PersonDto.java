package com.example.AppTraining.dto;

import com.example.AppTraining.domain.Adress;
import lombok.Data;

import java.util.List;

@Data
public class PersonDto {

    private String name;
    private String surename;
    private List<Adress> listOfAdress;
}
