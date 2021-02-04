package com.example.demo.services;


import com.example.demo.model.Abonament;
import com.example.demo.model.User;
import com.example.demo.repository.Abonament_repo;
import com.example.demo.repository.User_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Abonamentservice {


    private final Abonament_repo abonament_repo;
    @Autowired
    public Abonamentservice (Abonament_repo abonament_repo)
    {
        this.abonament_repo=abonament_repo;
    }

    //METODE
    public List<Abonament> getAbonamente()
    {
        List<Abonament> abonamente = new ArrayList<>();
        abonament_repo.findAll().forEach(x -> abonamente.add(x));
        return abonamente;
    }
}
