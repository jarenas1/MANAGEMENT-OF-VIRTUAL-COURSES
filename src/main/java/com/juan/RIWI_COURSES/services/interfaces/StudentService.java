package com.juan.RIWI_COURSES.services.interfaces;


import com.juan.RIWI_COURSES.dtos.request.StudentRequest;
import com.juan.RIWI_COURSES.entities.StudentEntity;
import com.juan.RIWI_COURSES.services.CRUD.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService extends ReadAll<StudentEntity>,
        ReadByID<StudentEntity, String>,
        Save<StudentEntity>{
}

