package com.juan.RIWI_COURSES.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
//Lombok called
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lessons")
public class LessonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private boolean status;
    private String name;
    private ClassEntity class_id;
}
