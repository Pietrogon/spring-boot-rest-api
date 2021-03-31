package com.pietrogon.springbootrestapi;// CRUD refers Create, Read, Update, Delete

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
}