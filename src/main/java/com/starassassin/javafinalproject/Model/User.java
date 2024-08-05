package com.starassassin.javafinalproject.Model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.hibernate.validator.constraints.UUID;

@Getter
public class User {
    
    @UUID
    private long id;
    @NotNull
    private String name;
    @NotNull
    private String email;
}
