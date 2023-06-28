package com.example.mobilityfordev.controller;

import com.example.mobilityfordev.entities.Manager;
import com.example.mobilityfordev.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerWeb {

    @Autowired
    private ManagerRepository managerRepository;

    @PostMapping(value="/addmanager")
    public void addMnagaer(@RequestBody Manager manager){
        managerRepository.save(manager);
    }
}
