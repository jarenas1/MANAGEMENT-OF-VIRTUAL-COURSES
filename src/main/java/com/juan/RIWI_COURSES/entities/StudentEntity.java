package com.juan.RIWI_COURSES.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false, length = 155)
    private String name;

    @Column(nullable = false,unique = true,length = 155)
    private String email;

    @Column(nullable = false)
    private LocalDateTime creatAt;


    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT true")
    private Boolean active;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private ClassEntity class_id;

    @OneToMany(mappedBy = "studentEntity" , cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<ClassEntity> classes;



}
