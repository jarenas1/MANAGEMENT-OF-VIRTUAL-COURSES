package com.juan.RIWI_COURSES.dtos.request;


import com.juan.RIWI_COURSES.utils.Type;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MultimediaRequest {

    @NotNull(message = "El tipo de multimedia no puede ser nulo")
    @Pattern(regexp = "VIDEO|AUDIO|DOCUMENT", message = "El tipo debe tener los siguientes opciones: VIDEO, AUDIO, DOCUMENT")
    private Type type;
    @NotBlank (message = "El id de la lesión es requerido")
    private String lesson_id;
    @NotBlank(message = "El url de la multimedia no puede estar vacío")
    private String url;
}
