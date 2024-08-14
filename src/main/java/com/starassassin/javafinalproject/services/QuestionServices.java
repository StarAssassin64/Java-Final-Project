package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.User;

import java.util.List;

public interface QuestionServices {
     List<Question> getAll();
     void deleteQuestions(int id);
     Question getQuestionById(int id);
     Question saveQuestion(Question question);
}
