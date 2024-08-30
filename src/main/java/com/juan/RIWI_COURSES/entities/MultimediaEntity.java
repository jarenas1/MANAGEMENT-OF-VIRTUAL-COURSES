package com.juan.RIWI_COURSES.entities;

import com.juan.RIWI_COURSES.utils.Type;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "multimedia")
public class MultimediaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private String url;

    @ManyToOne
    @JoinColumn(name = "lesson_id", nullable = false)  // Clave foránea que apunta a la entidad LessonEntity
    private LessonEntity lessonEntity;
}