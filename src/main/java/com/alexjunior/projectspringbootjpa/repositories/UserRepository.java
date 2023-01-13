package com.alexjunior.projectspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexjunior.projectspringbootjpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
