package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.User;
import com.starassassin.javafinalproject.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServicesImpl implements QuestionServices {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getAll() {
        return (List<Question>) questionRepository.findAll();
    }

    @Override
    public void deleteQuestions(int id) {

    }

    @Override
    public Question getQuestionById(int id) {
        return null;
    }

    @Override
    public Question saveQuestion(Question question) {
        return null;
    }
}
