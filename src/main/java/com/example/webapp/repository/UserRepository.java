package com.example.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}