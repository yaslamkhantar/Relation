package com.example.mobilityfordev.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Manager {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cin;

    private String name;
     private String prenom;
     private int nbrexp;

     @OneToMany(mappedBy = "manager1")
     private List<Equipe> equipeList;

}
