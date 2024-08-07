package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.Test;

import java.util.List;

public interface TestServices {
    Test startTest(List<Question> questions);
}
