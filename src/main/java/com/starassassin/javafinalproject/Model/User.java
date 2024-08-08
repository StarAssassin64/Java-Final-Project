package com.starassassin.javafinalproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    private int lastScore;
}
