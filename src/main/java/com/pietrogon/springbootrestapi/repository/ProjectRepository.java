package com.pietrogon.springbootrestapi.repository;// CRUD refers Create, Read, Update, Delete

import com.pietrogon.springbootrestapi.entity.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}