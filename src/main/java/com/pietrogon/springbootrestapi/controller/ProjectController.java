package com.pietrogon.springbootrestapi.controller;

import com.pietrogon.springbootrestapi.entity.Appointments;
import com.pietrogon.springbootrestapi.entity.Project;
import com.pietrogon.springbootrestapi.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {
    @Autowired
    public ProjectController(final ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    private ProjectRepository projectRepository;

    @GetMapping(path="/projects")
    @ResponseBody
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping(path="/projects/user/{id}")
    @ResponseBody
    @PreAuthorize("hasRole('USER')")
    public Iterable<Project> getProject(@PathVariable Long id) {
        return projectRepository.findByUserId(id);
    }

}
