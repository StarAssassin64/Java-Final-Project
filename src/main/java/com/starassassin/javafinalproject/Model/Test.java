package com.starassassin.javafinalproject.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Test {
    @Id
    private int id;
    @OneToOne
    @JoinColumn(name = "questionId", nullable = false)
    private Question question1;
    @OneToOne
    @JoinColumn(name = "questionId", nullable = false)
    private Question question2;
    @OneToOne
    @JoinColumn(name = "questionId", nullable = false)
    private Question question3;
    @OneToOne
    @JoinColumn(name = "questionId", nullable = false)
    private Question question4;
    @OneToOne
    @JoinColumn(name = "questionId", nullable = false)
    private Question question5;
    @OneToOne
    @JoinColumn(name = "questionId", nullable = false)
    private Question question6;
    private int score;
    
}
