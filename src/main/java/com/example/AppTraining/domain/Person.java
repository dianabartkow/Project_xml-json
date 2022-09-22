package com.example.AppTraining.domain;

import lombok.*;

import javax.persistence.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String Name;

    @Column(name = "Surename")
    private String SureName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_address") //jak go używać?? kiedy to a kiedy mapped by..??
    private Adress adress;


}
