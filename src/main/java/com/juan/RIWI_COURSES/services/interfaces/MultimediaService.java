package com.juan.RIWI_COURSES.services.interfaces;

import com.juan.RIWI_COURSES.dtos.request.MultimediaRequest;
import com.juan.RIWI_COURSES.entities.MultimediaEntity;
import com.juan.RIWI_COURSES.services.CRUD.*;

public interface MultimediaService extends ReadAll<MultimediaEntity>,
        ReadByID<MultimediaEntity, String>,
        /*Create<MultimediaRequest, String>,*/
        Save<MultimediaEntity>,
        Destroy<String>{
    //Atributos de MultimediaService
    //Constructores de MultimediaService
    //Asignadores de atributos de MultimediaService (setters)
    //Lectores de atributos de MultimediaService (getters)
    //Métodos de MultimediaService
}
