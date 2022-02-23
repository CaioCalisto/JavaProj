package com.example.demo.controllers;

import com.example.demo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private List<User> users;

    public HelloController(){
        users = new ArrayList<>(3);
        users.add(new User(1, "caio", 33));
        users.add(new User(2, "dom", 45));
        users.add(new User(3, "steve", 40));
    }

    @GetMapping(value = "/")
    public String GetHelloWorld(){
        return "Hello, welcome to Java Restful API";
    }

    @GetMapping(value = "/users")
    public List<User> GetUsers(){
        return this.users;
    }

    @PostMapping(value = "/user")
    public String SaveNewUser(@RequestBody User user){

        return "I should return some Status Code here.";
    }

}
