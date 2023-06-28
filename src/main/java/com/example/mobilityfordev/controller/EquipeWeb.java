package com.example.mobilityfordev.controller;

import com.example.mobilityfordev.entities.Equipe;
import com.example.mobilityfordev.repository.Equiperepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipeWeb {

    @Autowired
    private Equiperepository equiperepository;
    @PostMapping(value="/addequipe")
    public void addEquipe(@RequestBody Equipe equipe){
        equiperepository.save(equipe);

    }

}
