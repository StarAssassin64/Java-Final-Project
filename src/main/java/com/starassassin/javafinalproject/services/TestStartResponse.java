package com.starassassin.javafinalproject.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuizStartResponse {
    private boolean started;
    private String message;
    public QuizStartResponse(boolean started, String message) {
        this.started = started;
        this.message = message;
    }
}
