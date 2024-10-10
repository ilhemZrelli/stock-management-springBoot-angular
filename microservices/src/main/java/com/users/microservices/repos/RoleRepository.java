package com.users.microservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.microservices.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
    Role findByRole(String role);
}
