package com.starassassin.javafinalproject.repository;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Integer> {
    List<Question> findQuestionByQuestionId(int questionId);
    User findUserByUserId(int userId);

}
