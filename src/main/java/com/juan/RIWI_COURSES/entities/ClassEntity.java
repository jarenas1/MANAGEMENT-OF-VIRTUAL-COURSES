package com.juan.RIWI_COURSES.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.core.SpringVersion;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "classes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassEntity {

    @Id //Anotación para que sea valor unico o primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column (nullable = false,length = 155)
    private String name;
    @Column (nullable = false,length = 155)
    private String description;
    @Column (nullable = false)
    private LocalDate createAt;
    @Column(nullable = false)
    private Boolean status;
    @JoinColumn(name = "student_id", nullable = false)
    private StudentEntity student;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "classEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<StudentEntity> students;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "classEntity" , cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<LessonEntity> lessons;







}
