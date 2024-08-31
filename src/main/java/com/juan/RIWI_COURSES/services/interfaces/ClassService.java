package com.juan.RIWI_COURSES.services.interfaces;

import com.juan.RIWI_COURSES.entities.ClassEntity;
import com.juan.RIWI_COURSES.services.CRUD.*;

public interface ClassService extends ReadAll<ClassEntity>,
        ReadByID<ClassEntity, String>,
        Create<ClassEntity, String>,
        Save<ClassEntity>,
        Destroy<ClassEntity>{
    //Atributos de ClassService
    //Constructores de ClassService
    //Asignadores de atributos de ClassService (setters)
    //Lectores de atributos de ClassService (getters)
    //Métodos de ClassService
}
