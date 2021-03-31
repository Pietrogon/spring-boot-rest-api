package com.pietrogon.springbootrestapi;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserInProjectsRepository extends CrudRepository<UserInProjects, Integer> {

    @Query("SELECT projects FROM UserInProjects projects WHERE projects.idProject = :id")
    Iterable<UserInProjects> findByProject(@Param("id") Integer id);

}