package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface User_repo extends CrudRepository<User,Integer> {
}
