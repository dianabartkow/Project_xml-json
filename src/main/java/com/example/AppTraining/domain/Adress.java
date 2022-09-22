package com.example.AppTraining.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String country;
    private String city;
    private String postcode;
    private String HouseNumber;


}
