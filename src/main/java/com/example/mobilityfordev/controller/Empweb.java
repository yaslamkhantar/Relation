package com.example.mobilityfordev.controller;

import com.example.mobilityfordev.entities.Employe;
import com.example.mobilityfordev.repository.Employerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Empweb {

    @Autowired
    Employerepository employerepository;
    @GetMapping(value = "/getall")
    public List<Employe> envoyerlist(){
        return employerepository.findAll();
    }

    @GetMapping(value="/getbuid")
    public Employe getEmploye(@RequestParam("name") String name){
      return   employerepository.findByName(name);
    }
    @DeleteMapping(value = "/dt/{cin}")
    public void deleteEmploye(@PathVariable Long cin){
        employerepository.deleteById(cin);
    }

    @PostMapping(value = "/addemploye")
    public void addemploye(@RequestBody  Employe employe){
        employerepository.save((employe));
    }
    @PutMapping(value="/empl")
    public void modify(@RequestBody  Employe employe){
        Employe s=employerepository.findById(employe.getCin()).get();
        s.setCin(employe.getCin());
        s.setName(employe.getName());
        s.setPrenom(employe.getPrenom());
        s.setNbrexperience(employe.getNbrexperience());
        employerepository.save(s);

    }

}
