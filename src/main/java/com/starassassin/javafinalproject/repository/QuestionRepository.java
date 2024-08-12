package com.starassassin.javafinalproject.repository;

import com.starassassin.javafinalproject.Model.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Integer> {
    List<Question> findQuestionByUserId(int userId);
}
