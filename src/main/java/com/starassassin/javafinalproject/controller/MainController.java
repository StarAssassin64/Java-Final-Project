package com.starassassin.javafinalproject.controller;

import com.starassassin.javafinalproject.Model.Test;
import com.starassassin.javafinalproject.Model.User;
import com.starassassin.javafinalproject.services.TestServicesImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String logIn(User user){
        return "index";
    }

    @PostMapping("/")
    public String loginValidation(@Valid User user, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("errors", result.getAllErrors());
            return "index";
        }
        return "index";
    }

    @GetMapping("/multiQuiz")
    public String multiquiz(Test test, TestServicesImpl services){
        return "quizmc";
    }

    @PostMapping("/quiz-submit")
    public String quizSubmit(){
        return "quiz-submit";
    }

    @GetMapping("/shortQuiz")
    public String shortQuiz(Test test, TestServicesImpl services){
        return "quizsa";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/scores")
    public String scores(){
        return "scores";
    }
}
