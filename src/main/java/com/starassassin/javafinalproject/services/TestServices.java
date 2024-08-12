package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;

import java.util.List;


public interface TestServices {
    TestStartResponse startTest(List<Question> questions);
    ScoreResponse finishTest();
    ScoreResponse answerQuestion(Long userId, Question questionId,String answer);
}
