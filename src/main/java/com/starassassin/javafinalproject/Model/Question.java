package com.starassassin.javafinalproject.Model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

@Getter
@Setter
public class Question {
    @UUID
    private int id;
    @NotNull
    private String question;
    @NotNull
    private String correctAnswer;
    private String wrongAnswer1;
    private String wrongAnswer2;
    private String wrongAnswer3;
    private boolean correct;
}
