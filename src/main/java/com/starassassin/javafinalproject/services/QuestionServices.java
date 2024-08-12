package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;

public interface QuestionServices {
     void deleteQuestions(int id);
     Question getQuestionById(int id);
     Question saveQuestion(Question question);
}
