package com.pietrogon.springbootrestapi.repository;

import com.pietrogon.springbootrestapi.entity.ERole;
import com.pietrogon.springbootrestapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}