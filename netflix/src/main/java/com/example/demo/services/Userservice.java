package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.repository.User_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class Userservice {

    private final User_repo user_repo;
    @Autowired
    public Userservice (User_repo users_repo)
    {
        this.user_repo=users_repo;
    }

    //METODE
    //metoda get
    public List<User> getUsers()
    {
        List<User> users = new ArrayList<>();
        user_repo.findAll().forEach(x -> users.add(x));
        return users;
    }

    //metoda post
    public User creareUser(@RequestBody User user)
    {
        return user_repo.save(user);
    }

    //metoda put
    public User actualizareUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        user.setUser_id(id);
        return user_repo.save(user);
    }

    //patch
    public User actPatchUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        User newuser = user_repo.findById(id).get();
        user.setUser_id(id);
        if(user.getNume() != null)
        {
            newuser.setNume(user.getNume());
        }
        if(user.getEmail() != null)
        {
            newuser.setEmail(user.getEmail());
        }
        if(user.getParola() != null)
        {
            newuser.setParola(user.getParola());
        }if(user.getData_nastere() != null)
    {
        newuser.setData_nastere(user.getData_nastere());
    }

        return user_repo.save(newuser);
    }

    public void DeleteUser(@PathVariable("id") Integer id)
    {
        user_repo.deleteById(id);
    }
}

