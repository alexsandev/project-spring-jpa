package com.alexjunior.projectspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexjunior.projectspringbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
