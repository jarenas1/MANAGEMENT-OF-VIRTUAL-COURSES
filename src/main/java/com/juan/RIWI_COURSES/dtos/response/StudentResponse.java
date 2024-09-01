package com.juan.RIWI_COURSES.dtos.response;

import com.juan.RIWI_COURSES.entities.ClassEntity;
import jakarta.persistence.Column;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StudentResponse {
    //Media without id and status
    private String name;
    private String email;
    private Boolean active;
    private List<ClassEntity> classes;


}
