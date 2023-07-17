package com.exam.examserver.controllers;

import com.exam.examserver.models.User;
import com.exam.examserver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User>getUser(){
        System.out.println("getting users");
        return this.userService.getUser();
    }

    //Api to return current user

    @GetMapping("/current-user")
    public  String getLoggedInUser(Principal principal){
        return principal.getName();

    }
}
