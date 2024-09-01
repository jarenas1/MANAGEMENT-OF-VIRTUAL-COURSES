package com.juan.RIWI_COURSES.services.interfaces;

import com.juan.RIWI_COURSES.dtos.request.LessonRequest;
import com.juan.RIWI_COURSES.entities.LessonEntity;
import com.juan.RIWI_COURSES.services.CRUD.*;

public interface LessonService extends ReadAll<LessonEntity>,
        ReadByID<LessonEntity, String>,
        /*Create<LessonRequest, String>,*/
        Save<LessonEntity>,
        Destroy<String> {
    //Atributos de LessonService
    //Constructores de LessonService
    //Asignadores de atributos de LessonService (setters)
    //Lectores de atributos de LessonService (getters)
    //Métodos de LessonService
}
