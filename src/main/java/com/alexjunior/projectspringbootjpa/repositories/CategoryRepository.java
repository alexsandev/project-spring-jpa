package com.alexjunior.projectspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexjunior.projectspringbootjpa.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
