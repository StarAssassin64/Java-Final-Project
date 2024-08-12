package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServicesImpl implements TestServices {
    @Override
    public TestStartResponse startTest(List<Question> questions) {
        return new TestStartResponse(true,"Quiz started!");
    }

    @Override
    public ScoreResponse finishTest() {
        boolean finished = true;
        String message = "Quiz finished!";
        int totQuestions = 6;
        int totalCorrectAnswers = 0;
        double scorePercentage = 0.0;
        return new ScoreResponse(finished,message,totQuestions,totalCorrectAnswers,scorePercentage);
    }

    @Override
    public ScoreResponse answerQuestion(Long userId, Question questionId, String answer) {
        return null;
    }
}
