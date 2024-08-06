package com.starassassin.javafinalproject.repository;

import com.starassassin.javafinalproject.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    boolean existsUserByName(String name);
}
