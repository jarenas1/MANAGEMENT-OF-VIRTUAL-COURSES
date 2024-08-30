package com.juan.RIWI_COURSES.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
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

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)  // Clave foránea que apunta a la entidad ClassEntity
    private ClassEntity classEntity;

    @OneToMany(mappedBy = "lessonEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MultimediaEntity> multimedia = new ArrayList<>();
}