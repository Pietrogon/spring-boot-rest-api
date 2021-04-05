package com.pietrogon.springbootrestapi.repository;// CRUD refers Create, Read, Update, Delete

import com.pietrogon.springbootrestapi.entity.Appointments;
import com.pietrogon.springbootrestapi.entity.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    @Query(
            value = "SELECT project.* FROM project, user_in_project WHERE project.id = user_in_project.project_id and user_in_project.user_id = ?1",
            nativeQuery = true)
    Iterable<Project> findByUserId(Long id);
}