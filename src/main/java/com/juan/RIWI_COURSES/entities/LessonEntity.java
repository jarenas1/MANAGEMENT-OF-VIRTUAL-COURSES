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
    @JoinColumn(name = "class_id", nullable = false)  //Se indica el nombre de la columna que va a contener la foregin key
    private ClassEntity classEntity; //Se indica por medio de la instacia la clase de la que se llama la PK


    @OneToMany(mappedBy = "lessonEntity", cascade = CascadeType.ALL, orphanRemoval = true)//INDICA DONDE ESTA EL LADO DE LA RELACION PRINCIPAL(mappedBy)
    private List<MultimediaEntity> multimedia;
}