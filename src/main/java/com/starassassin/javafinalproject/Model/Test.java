package com.starassassin.javafinalproject.Model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

@Getter
@Setter
public class Test {
    @UUID
    private int id;
    @NotNull
    private Question[] questions;
    private int score;
    
}
