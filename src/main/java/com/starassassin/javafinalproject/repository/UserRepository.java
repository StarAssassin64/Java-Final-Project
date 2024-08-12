package com.starassassin.javafinalproject.repository;

import com.starassassin.javafinalproject.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsUserByName(String name);

}
