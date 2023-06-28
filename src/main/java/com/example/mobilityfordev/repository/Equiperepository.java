package com.example.mobilityfordev.repository;

import com.example.mobilityfordev.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Equiperepository extends JpaRepository<Equipe,Long> {

    Equipe findByName(String name);
}
