package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.User;

import java.util.Optional;

public interface UserServices {
    User createUser(User user);
    boolean getUserLogging(String name);
    Optional<User> findUserById(long id);
}
