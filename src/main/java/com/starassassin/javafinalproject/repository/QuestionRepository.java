package com.starassassin.javafinalproject.repository;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {
    List<Question> findQuestionByQuestionId(int questionId);
}
