package com.starassassin.javafinalproject.services;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ScoreResponse {
    private boolean success;
    private String message;
    private int totalQuestions;
    private int correctAnswers;
    private double scorePercentage;

    public ScoreResponse(boolean success, String message, int totalQuestions, int correctAnswers, double scorePercentage) {
        this.success = success;
        this.message = message;
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.scorePercentage = scorePercentage;
    }

}
