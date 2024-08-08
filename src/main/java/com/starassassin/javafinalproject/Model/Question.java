package com.starassassin.javafinalproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Question {
    @Id
    private int questionId;
    @NotNull
    private String question;
    private boolean correct;
    private Answer[] answers;
}
