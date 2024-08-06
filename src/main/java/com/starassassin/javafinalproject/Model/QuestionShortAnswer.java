package com.starassassin.javafinalproject.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class QuestionShortAnswer extends Question {
    private String answer;
    private boolean correct;
}
