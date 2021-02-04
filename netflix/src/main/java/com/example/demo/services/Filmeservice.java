package com.example.demo.services;

import com.example.demo.model.Filme;
import com.example.demo.model.User;
import com.example.demo.repository.Filme_repo;
import com.example.demo.repository.User_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Filmeservice {

    private final Filme_repo filme_repo;
    @Autowired
    public Filmeservice (Filme_repo filme_repo)
    {
        this.filme_repo=filme_repo;
    }

    //METODE
    public List<Filme> getFilme()
    {
        List<Filme> filme = new ArrayList<>();
        filme_repo.findAll().forEach(x -> filme.add(x));
        return filme;
    }
}
