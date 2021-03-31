package com.pietrogon.springbootrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserInProjectsController {
    @Autowired
    private UserInProjectsRepository userInProjectsRepository;

    @GetMapping(path="/userInProjects")
    public @ResponseBody
    Iterable<UserInProjects> getAllUserInProjects() {
        return userInProjectsRepository.findAll();
    }

    @GetMapping(path="/userInProjects/{id}")
    public @ResponseBody
    Optional<UserInProjects> getUserInProject(@PathVariable Integer id) {
        return userInProjectsRepository.findById(id);
    }

    @GetMapping(path="/userInProjects/project/{id}")
    public @ResponseBody
    Iterable<UserInProjects> getUserInProjectByProject(@PathVariable Integer id) {
        return userInProjectsRepository.findByProject(id);
    }

    @DeleteMapping(path="/userInProjects/{id}")
    public @ResponseBody
    void deleteUserInProject(@PathVariable Integer id) {
        userInProjectsRepository.deleteById(id);
    }

    @PostMapping(path="/userInProjects")
    public @ResponseBody
    void saveUserInProject(@RequestBody UserInProjects userInProject) {
        userInProjectsRepository.save(userInProject);
    }

    @PutMapping(path="/userInProjects")
    public @ResponseBody
    void updateUserInProject(@RequestBody UserInProjects userInProject) {
        userInProjectsRepository.save(userInProject);
    }
}
