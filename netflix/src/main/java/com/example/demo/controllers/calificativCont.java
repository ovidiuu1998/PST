package com.example.demo.controllers;


import com.example.demo.model.Calificativ;
import com.example.demo.model.User;
import com.example.demo.services.Calificativservice;
import com.example.demo.services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calificative")
public class calificativCont {

    private Calificativservice calificativservice;
    //Constructor
    @Autowired
    public  calificativCont ( Calificativservice calificativservice)
    {
        this.calificativservice=calificativservice;
    }


    @GetMapping
    public List<Calificativ> getCalificative(){
        return calificativservice.getCalificative();
    }
}
