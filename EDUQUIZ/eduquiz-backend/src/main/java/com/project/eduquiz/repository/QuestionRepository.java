package com.project.eduquiz.repository;

import com.project.eduquiz.models.Question;
import com.project.eduquiz.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuiz(Quiz quiz);
}
