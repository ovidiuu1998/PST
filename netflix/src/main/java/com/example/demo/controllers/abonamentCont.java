package com.example.demo.controllers;

import com.example.demo.model.Abonament;
import com.example.demo.model.User;
import com.example.demo.services.Abonamentservice;
import com.example.demo.services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/abonamente")
public class abonamentCont {

    private Abonamentservice abonamentservice;
    //Constructor
    @Autowired
    public abonamentCont (Abonamentservice abonamentservice)
    {
        this.abonamentservice=abonamentservice;
    }


    @GetMapping
    public List<Abonament> getAbonament(){
        return abonamentservice.getAbonamente();
    }
}
