package com.pietrogon.springbootrestapi.controller;

import com.pietrogon.springbootrestapi.entity.Project;
import com.pietrogon.springbootrestapi.entity.User;
import com.pietrogon.springbootrestapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    public UserController(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    @GetMapping(path="/users")
    @ResponseBody
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path="/users/{id}")
    @ResponseBody
    public Optional<User> getUser(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @DeleteMapping(path="/users/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    @PostMapping(path="/users")
    @ResponseBody
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping(path="/users")
    @ResponseBody
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
