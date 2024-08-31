package com.juan.RIWI_COURSES.services.interfaces;


import com.juan.RIWI_COURSES.entities.StudentEntity;
import com.juan.RIWI_COURSES.services.CRUD.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService extends ReadAll<StudentEntity>,
        ReadByID<StudentEntity, String>,
        Create<StudentRequest, String>,
        Save<StudentEntity>,
        Destroy<StudentEntity>{
    //Atributos de StudentService
    //Constructores de StudentService
    //Asignadores de atributos de StudentService (setters)
    //Lectores de atributos de StudentService (getters)
    //Métodos de StudentService
}
