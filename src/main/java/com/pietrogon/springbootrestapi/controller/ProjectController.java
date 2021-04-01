package com.pietrogon.springbootrestapi.controller;

import com.pietrogon.springbootrestapi.entity.Project;
import com.pietrogon.springbootrestapi.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ProjectController {
    @Autowired
    public ProjectController(final ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    private ProjectRepository projectRepository;

    @GetMapping(path="/projects")
    @ResponseBody
    public Iterable<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping(path="/projects/{id}")
    @ResponseBody
    public Optional<Project> getProject(@PathVariable Long id) {
        return projectRepository.findById(id);
    }

    @DeleteMapping(path="/projects/{id}")
    @ResponseBody
    public void deleteProject(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }

    @PostMapping(path="/projects")
    @ResponseBody
    public void saveProject(@RequestBody Project project) {
        projectRepository.save(project);
    }

    @PutMapping(path="/projects")
    @ResponseBody
    public void updateProject(@RequestBody Project project) {
        projectRepository.save(project);
    }
}
