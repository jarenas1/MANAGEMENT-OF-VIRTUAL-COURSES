package com.juan.RIWI_COURSES.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LessonResponse {
    //Lesson without id and status

    private String name;
    private String class_id;

}
