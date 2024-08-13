package com.starassassin.javafinalproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Question {
    @Id
    private int questionId;
    @NotNull
    private String question;
    private boolean correct;
}
