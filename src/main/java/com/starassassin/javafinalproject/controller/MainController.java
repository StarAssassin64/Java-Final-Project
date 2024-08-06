package com.starassassin.javafinalproject.controller;

import com.starassassin.javafinalproject.Model.User;
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
        return "login";
    }

    @PostMapping("/")
    public String loginValidation(@Valid User user, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("errors", result.getAllErrors());
            return "index";
        }
        // todo add service
        return "index";
    }
}
