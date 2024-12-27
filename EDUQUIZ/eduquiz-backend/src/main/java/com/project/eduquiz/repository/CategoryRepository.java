package com.project.eduquiz.repository;


import com.project.eduquiz.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
