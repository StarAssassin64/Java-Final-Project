package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.User;
import com.starassassin.javafinalproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean getUserLogging(String name) {
        return userRepository.existsUserByName(name);
    }

    @Override
    public Optional<User> findUserById(long id) {
        return userRepository.findById(id);
    }
}
