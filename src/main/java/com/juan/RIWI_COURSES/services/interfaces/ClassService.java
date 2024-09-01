package com.juan.RIWI_COURSES.services.interfaces;

import com.juan.RIWI_COURSES.dtos.request.ClassRequest;
import com.juan.RIWI_COURSES.entities.ClassEntity;
import com.juan.RIWI_COURSES.services.CRUD.*;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ClassService extends
        Save<ClassEntity>,
        Destroy<String>{

    public Page<ClassEntity> getPaginatedClasses(String name, String description, int page, int size);
    public Optional<ClassEntity> getClassById(String id);
}
