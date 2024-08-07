package com.starassassin.javafinalproject.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Test {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn (name = "questionID", insertable=false, updatable=false)
    private Question question1;
    @ManyToOne
    @JoinColumn (name = "questionID", insertable=false, updatable=false)
    private Question question2;
    @ManyToOne
    @JoinColumn (name = "questionID", insertable=false, updatable=false)
    private Question question3;
    @ManyToOne
    @JoinColumn (name = "questionID", insertable=false, updatable=false)
    private Question question4;
    @ManyToOne
    @JoinColumn (name = "questionID", insertable=false, updatable=false)
    private Question question5;
    @ManyToOne
    @JoinColumn (name = "questionID", insertable=false, updatable=false)
    private Question question6;
    private int score;
    
}
