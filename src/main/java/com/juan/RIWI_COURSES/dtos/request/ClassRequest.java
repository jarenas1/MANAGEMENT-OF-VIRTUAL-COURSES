package com.juan.RIWI_COURSES.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassRequest {
    @NotBlank(message = "El nombre de la clase no puede estar vacío")
    @Size(min = 1, max = 100, message = "El nombre de la clase debe tener entre 1 y 100 caracteres")
    private String name;
    @NotBlank(message = "La descripción de la clase no puede estar vacía")
    private String description;
}
