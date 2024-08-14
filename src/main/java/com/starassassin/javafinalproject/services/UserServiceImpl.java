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
public class UserServiceImpl implements UserServices  {
    private final UserRepository userRepository;
    private final QuestionRepository questionRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, QuestionRepository questionRepository) {
        this.userRepository = userRepository;
        this.questionRepository = questionRepository;
        List<Question> questions = (List<Question>) questionRepository.findAll();
        if (questions.isEmpty()) {
            DatabaseConfiguration.SetupDatabase(questionRepository);
        }
    }

    @Override
    public User createUser(User user) {
//        validateUser(user);
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

//    private void validateUser(User user) throws ConstraintViolationException {
//        String usernameRegex = "^[A-Za-z]\\w{5,29}$";
//        Pattern usernamePattern = Pattern.compile(usernameRegex);
//        Matcher usernameMatcher = usernamePattern.matcher(user.getName());
//        if (!usernameMatcher.matches()) {
//            throw new IllegalArgumentException("Invalid username format");
//        }
//        if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
//            throw new IllegalArgumentException("Email is required");
//        }
//    }

}
