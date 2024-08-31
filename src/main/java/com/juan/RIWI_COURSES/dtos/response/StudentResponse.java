package com.juan.RIWI_COURSES.dtos.response;

import com.juan.RIWI_COURSES.entities.ClassEntity;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentResponse {
    //Media without id and status
    private String name;
    private String email;
    private String clase;
    private ClassEntity class_id;
    private List<ClassEntity> classes;

}
