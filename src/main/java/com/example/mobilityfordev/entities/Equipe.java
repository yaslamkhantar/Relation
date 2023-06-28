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
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;

    private String name;
    private int size;
    @OneToMany(mappedBy = "equipe")
    private List<Employe> employeList;

    @ManyToOne
    private Manager manager1;
}
