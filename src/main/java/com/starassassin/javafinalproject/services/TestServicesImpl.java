package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.Test;
import com.starassassin.javafinalproject.exceptions.EmptyQuestionException;
import com.starassassin.javafinalproject.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServicesImpl implements TestServices {
    public ArrayList<Question> askedQuestions = new ArrayList<Question>();
    private final QuestionRepository questionRepository;
    
    
    @Autowired
    public TestServicesImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    
    public Question getRandomQuestion() throws EmptyQuestionException {
        List<Question> questions = (List<Question>) questionRepository.findAll();
        if (questions.isEmpty()) {
            throw new EmptyQuestionException();
        } else {
            int randomIndex = (int) (Math.random() * questions.size());
            return questions.get(randomIndex);
        }
    }
    
    @Override
    public Test startTest(List<Question> questions) {
        return null;
    }
}
