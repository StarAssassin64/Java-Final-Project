package com.starassassin.javafinalproject.exceptions;

public class EmptyQuestionException extends Exception {
    
    public EmptyQuestionException() {
        super("Question database is empty");
    }
}
