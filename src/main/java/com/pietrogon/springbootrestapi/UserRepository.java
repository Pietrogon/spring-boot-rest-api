package com.pietrogon.springbootrestapi;// CRUD refers Create, Read, Update, Delete

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}