package com.starassassin.javafinalproject.Model;

import jakarta.persistence.Entity;

@Entity
public class QuestionShortAnswer extends Question {
    private String answer;
    private boolean correct;
}
