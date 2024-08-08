package com.starassassin.javafinalproject.repository;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends CrudRepository<Test,Integer> {
    Test findById(int id);
    List<Test> findAll();
}
