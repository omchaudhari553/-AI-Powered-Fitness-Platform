package com.vaibhav.microservices.userservice.repository;

import com.vaibhav.microservices.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Boolean existsByEmail(String email);

    User findByEmail(String email);

    Boolean existsByKeycloakId(String userId);
}