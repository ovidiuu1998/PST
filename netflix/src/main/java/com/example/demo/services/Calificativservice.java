package com.example.demo.services;


import com.example.demo.model.Calificativ;
import com.example.demo.model.User;
import com.example.demo.repository.Calificativ_repo;
import com.example.demo.repository.User_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Calificativservice {

    private final Calificativ_repo calificativ_repo;
    @Autowired
    public Calificativservice (Calificativ_repo calificativ_repo)
    {
        this.calificativ_repo=calificativ_repo;
    }

    //METODE
    public List<Calificativ> getCalificative()
    {
        List<Calificativ> calificative = new ArrayList<>();
        calificativ_repo.findAll().forEach(x -> calificative.add(x));
        return calificative;
    }
}
