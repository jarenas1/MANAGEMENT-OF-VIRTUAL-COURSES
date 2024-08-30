package com.juan.RIWI_COURSES.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonEntity {

    private String id;
    private boolean status;
    private String name;
    private ClassEntity class_id;
}
