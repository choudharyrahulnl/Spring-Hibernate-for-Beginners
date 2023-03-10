package com.spring.hibernate.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.spring.hibernate.entities.Student} entity
 */
@Data
public class StudentDto implements Serializable {
    private final Long id;
    @Size(max = 45)
    @NotNull
    private final String firstName;
    @Size(max = 45)
    @NotNull
    private final String lastName;
    @Size(max = 45)
    @NotNull
    @Email(message = "Not a valid email")
    private final String email;

}