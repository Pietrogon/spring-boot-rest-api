package com.pietrogon.springbootrestapi.repository;// CRUD refers Create, Read, Update, Delete

import com.pietrogon.springbootrestapi.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}