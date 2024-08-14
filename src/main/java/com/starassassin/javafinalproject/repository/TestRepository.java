package com.starassassin.javafinalproject.repository;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<Test,Integer> {
    Test findById(int id);
}
