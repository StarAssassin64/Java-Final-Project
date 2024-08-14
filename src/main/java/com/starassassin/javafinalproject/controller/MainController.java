package com.starassassin.javafinalproject.controller;

import com.starassassin.javafinalproject.Model.Question;
import com.starassassin.javafinalproject.Model.Test;
import com.starassassin.javafinalproject.Model.User;
import com.starassassin.javafinalproject.exceptions.EmptyQuestionException;
import com.starassassin.javafinalproject.services.TestServices;
import com.starassassin.javafinalproject.services.TestServicesImpl;
import com.starassassin.javafinalproject.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {
    private final UserServices userServices;

    @Autowired
    public MainController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping()
    public String logIn(User user){
        return "index";
    }

    @PostMapping()
    public String loginValidation(@Valid User user, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("errors", result.getAllErrors());
            return "index";
        }
        if (!userServices.emailExists(user.getEmail())){
            userServices.createUser(user);
        }
        return "home";
    }

    @PostMapping("/multiQuiz")
    public String multiquiz(Test test, Model model){
        return "quizmc";
    }

    @PostMapping("/quiz-submit")
    public String quizSubmit(){
        return "quiz-submit";
    }

    @PostMapping("/shortQuiz")
    public String shortQuiz(Test test){
        return "quizsa";
    }

    @GetMapping("/home")
    public String home(Test test, Model model){
        return "home";
    }

    @GetMapping("/scores")
    public String scores(){
        return "scores";
    }
}
