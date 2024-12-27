package com.project.eduquiz.repository;

import com.project.eduquiz.models.Category;
import com.project.eduquiz.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCategory(Category category);
}
