package com.juan.RIWI_COURSES.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonRequest {

    private String id;
    @NotBlank(message = "El nombre del curso no puede estar vacío")
    @Size(min = 1, max = 100, message = "El nombre del curso debe tener entre 1 y 100 caracteres")
    private String name;
    @NotNull(message = "El id de la clase no puede estar vacío")
    private String class_id;
}
