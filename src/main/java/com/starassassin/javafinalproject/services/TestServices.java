package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.Test;
import com.starassassin.javafinalproject.exceptions.EmptyQuestionException;

public interface TestServices {
    Test startTest() throws EmptyQuestionException;
    void endTest() throws EmptyQuestionException;
    int calculateScore(Long userId);
    void submitAnswer(Long userId, Long questionId);
}
