package com.project.eduquiz.services;

import com.project.eduquiz.models.QuizResult;

import java.util.List;

public interface QuizResultService {
    QuizResult addQuizResult(QuizResult quizResult);
    List<QuizResult> getQuizResults();

    List<QuizResult> getQuizResultsByUser(Long userId);
}

