package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.*;
import com.starassassin.javafinalproject.exceptions.EmptyQuestionException;
import com.starassassin.javafinalproject.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServicesImpl implements TestServices {
    public ArrayList<Question> askedQuestions = new ArrayList<>();
    private final QuestionRepository questionRepository;


    @Autowired
    public TestServicesImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
        List<Question> questions = (List<Question>) questionRepository.findAll();
        if (questions.isEmpty()) {
            DatabaseConfiguration.SetupDatabase(questionRepository);
        }
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
    public List<Question> getTestQuestions() throws EmptyQuestionException {
        List<Question> test = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            test.add(getRandomQuestion());
        }
        return test;
    }

    @Override
    public Test startTest() throws EmptyQuestionException {
        ArrayList<Question> questions = askedQuestions;
        while (askedQuestions.size() < 6) {
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

    @Override
    public void endTest() throws EmptyQuestionException {

    }

    @Override
    public int calculateScore(Long userId) {
        ArrayList<Question> userQuestions = (ArrayList<Question>) questionRepository.findQuestionByQuestionId(Math.toIntExact(userId));
        if (userQuestions == null || userQuestions.isEmpty()) {
            return 0;
        }
        int score = 0;
        for (Question question : userQuestions) {
            if (isAnswerCorrect(question, userId)) {
                score++;
            }
        }
        return score;
    }

    private boolean isAnswerCorrect(Question question, Long userId) {
        return false;
    }

    @Override
    public void submitAnswer(Long userId, Long questionId) {

    }
}

