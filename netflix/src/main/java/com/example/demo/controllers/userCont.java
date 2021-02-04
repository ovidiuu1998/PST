package com.example.demo.controllers;


import com.example.demo.model.User;
import com.example.demo.services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userCont {

    private Userservice userservice;
    //Constructor
    @Autowired
    public userCont (Userservice userservice)
    {
        this.userservice=userservice;
    }

//metoda get
    @GetMapping
    public List<User> getUsers(){
        return userservice.getUsers();
    }

    //metoda post
    @PostMapping
    public User creareUser(@RequestBody User user)
    {
        return userservice.creareUser(user);
    }

    //mettoda put
    @PutMapping("/{id}")
    public User actualizareUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        return userservice.actualizareUser(id,user);
    }

    //patch
    @PatchMapping("/{id}")
    public User actPatchUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        return userservice.actPatchUser(id,user);
    }

    //delete
    @DeleteMapping("/{id}")
    public void DeleteUser(@PathVariable("id") Integer id)
    {
        userservice.DeleteUser(id);
    }
}
