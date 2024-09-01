package com.juan.RIWI_COURSES.services.implementations;

import com.juan.RIWI_COURSES.dtos.request.LessonRequest;
import com.juan.RIWI_COURSES.entities.LessonEntity;
import com.juan.RIWI_COURSES.repositories.LessonRepository;
import com.juan.RIWI_COURSES.services.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {
        //Atributos de LessonServiceImpl
    @Autowired
    private LessonRepository lessonRepo;

    //Constructores de LessonServiceImpl
    //Asignadores de atributos de LessonServiceImpl (setters)
    //Lectores de atributos de LessonServiceImpl (getters)
        //Métodos de LessonServiceImpl
    @Override
    public List<LessonEntity> readAll() {
        return this.lessonRepo.findAll();
    }

    @Override
    public LessonEntity readByID(String id) {
        return this.lessonRepo.findById(id).orElseThrow();
    }

    @Override
    public LessonEntity save(LessonEntity lessonEntity) {
        return this.lessonRepo.save(lessonEntity);
    }

    /*@Override
    public String create(LessonRequest lessonRequest) {
        return null;
    }*/

    @Override
    public void destroy(String id) {
        this.lessonRepo.deleteById(id);
    }
}
