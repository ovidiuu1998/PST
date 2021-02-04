package com.example.demo.controllers;

import com.example.demo.model.Filme;
import com.example.demo.model.User;
import com.example.demo.services.Filmeservice;
import com.example.demo.services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class filmeCont {



    private Filmeservice filmeservice;
    //Constructor
    @Autowired
    public filmeCont (Filmeservice filmeservice)
    {
        this.filmeservice=filmeservice;
    }


    @GetMapping
    public List<Filme> getFilme(){
        return filmeservice.getFilme();
    }
}
