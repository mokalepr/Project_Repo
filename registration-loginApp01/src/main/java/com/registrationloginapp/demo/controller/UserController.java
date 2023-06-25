package com.registrationloginapp.demo.controller;


import com.registrationloginapp.demo.model.User;
import com.registrationloginapp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User addUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }

    @GetMapping("/users")
    List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
}
