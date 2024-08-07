package com.starassassin.javafinalproject.Model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class QuestionShortAnswer extends Question {
    private String answer;
    @NotNull
    private String correctAnswer;
    private boolean correct;
}
