package com.exam.examserver.services;

import com.exam.examserver.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Snnehasis","s@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Souvik","souvik@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }
}
