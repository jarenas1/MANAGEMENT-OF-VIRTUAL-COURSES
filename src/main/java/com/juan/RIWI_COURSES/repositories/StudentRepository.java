package com.juan.RIWI_COURSES.repositories;

import com.juan.RIWI_COURSES.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {
    //Atributos de StudentRepository
    //Constructores de StudentRepository
    //Asignadores de atributos de StudentRepository (setters)
    //Lectores de atributos de StudentRepository (getters)
    //Métodos de StudentRepository
}
