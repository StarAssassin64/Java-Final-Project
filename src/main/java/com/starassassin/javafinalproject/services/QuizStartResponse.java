package com.starassassin.javafinalproject.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestStartResponse {
    private boolean started;
    private String message;
    public TestStartResponse(boolean started, String message) {
        this.started = started;
        this.message = message;
    }
}
