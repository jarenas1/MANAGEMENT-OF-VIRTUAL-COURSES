package com.juan.RIWI_COURSES.dtos.request;


import com.juan.RIWI_COURSES.entities.ClassEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

    private String id;
    @NotBlank(message = "El nombre del estudiante no puede estar vacío")
    @Size(min = 1, max = 100, message = "El nombre del estudiante debe tener entre 1 y 100 caracteres")
    private String name;
    @Email
    private String email;

}
