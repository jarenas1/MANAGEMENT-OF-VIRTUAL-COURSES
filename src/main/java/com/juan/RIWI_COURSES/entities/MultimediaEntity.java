package com.juan.RIWI_COURSES.entities;

import com.juan.RIWI_COURSES.utils.Type;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MultimediaEntity {

    private String id;
    private Type type;
    private LessonEntity lesson_id;
    private boolean status;
    private String url;

}
