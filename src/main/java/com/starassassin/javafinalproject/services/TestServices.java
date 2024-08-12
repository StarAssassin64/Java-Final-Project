package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.Test;
import com.starassassin.javafinalproject.exceptions.EmptyQuestionException;

import java.util.List;

public interface TestServices {
    Test startTest() throws EmptyQuestionException;
}
