package com.pietrogon.springbootrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping(path="/projects")
    public @ResponseBody
    Iterable<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping(path="/projects/{id}")
    public @ResponseBody
    Optional<Project> getProject(@PathVariable Integer id) {
        return projectRepository.findById(id);
    }

    @DeleteMapping(path="/projects/{id}")
    public @ResponseBody
    void deleteProject(@PathVariable Integer id) {
        projectRepository.deleteById(id);
    }

    @PostMapping(path="/projects")
    public @ResponseBody
    void saveProject(@RequestBody Project project) {
        projectRepository.save(project);
    }

    @PutMapping(path="/projects")
    public @ResponseBody
    void updateProject(@RequestBody Project project) {
        projectRepository.save(project);
    }
}
