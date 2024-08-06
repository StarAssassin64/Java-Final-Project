package com.starassassin.javafinalproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

@Getter
@Setter
@Entity
public class User {
    
    @Id
    private long id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    private int lastScore;
}
