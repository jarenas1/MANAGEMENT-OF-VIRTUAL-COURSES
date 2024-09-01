package com.juan.RIWI_COURSES.dtos.response;

import com.juan.RIWI_COURSES.entities.LessonEntity;
import com.juan.RIWI_COURSES.entities.StudentEntity;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassResponse {

    //Media without id and status
    private String name;
    private String description;
    private String student_id;
    private String email;
    private List<StudentEntity> students;
    private List<LessonEntity> lessons;



}
