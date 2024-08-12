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
            while (true) {
                Question question = questions.get(randomIndex);
                if (askedQuestions.contains(question)) {
                    break;
                }
                randomIndex = (int) (Math.random() * questions.size());
            }
            askedQuestions.add(questions.get(randomIndex));
            return questions.get(randomIndex);
        }
    }
    
    @Override
    public Test startTest() throws EmptyQuestionException {
        ArrayList<Question> questions = askedQuestions;
        while (askedQuestions.size() <= 6) {
            questions.add(getRandomQuestion());
        }
        Test returnValue = new Test();
        returnValue.setQuestion1(questions.get(0));
        returnValue.setQuestion2(questions.get(1));
        returnValue.setQuestion3(questions.get(2));
        returnValue.setQuestion4(questions.get(3));
        returnValue.setQuestion5(questions.get(4));
        returnValue.setQuestion6(questions.get(5));
        return returnValue;
    }
}
