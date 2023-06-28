package com.example.mobilityfordev.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cin;
    private String name;
    private String prenom;
    private int nbrexperience;
    @ManyToOne
    private Equipe equipe;



}
