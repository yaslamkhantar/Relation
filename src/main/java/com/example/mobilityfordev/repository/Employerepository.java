package com.example.mobilityfordev.repository;

import com.example.mobilityfordev.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Employerepository extends JpaRepository<Employe, Long> {
    Employe findByName(String name);
}
