package com.starassassin.javafinalproject.services;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.User;
import com.starassassin.javafinalproject.repository.QuestionRepository;
import com.starassassin.javafinalproject.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserServices {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

//    @Override
//    public boolean getUserLogging(String name) {
//        return userRepository.existsUserByName(name);
//    }

    @Override
    public User findUserById(long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

    @Override
    public Boolean emailExists(String email) {
        return userRepository.existsUserByEmail(email);
    }
}
