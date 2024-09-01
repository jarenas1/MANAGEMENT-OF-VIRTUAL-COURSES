package com.juan.RIWI_COURSES.services.implementations;

import com.juan.RIWI_COURSES.entities.ClassEntity;
import com.juan.RIWI_COURSES.repositories.ClassRepository;
import com.juan.RIWI_COURSES.services.interfaces.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {
        //Atributos de ClassServiceImpl
    @Autowired
    private ClassRepository classRepo;

    //Constructores de ClassServiceImpl
    //Asignadores de atributos de ClassServiceImpl (setters)
    //Lectores de atributos de ClassServiceImpl (getters)
        //Métodos de ClassServiceImpl
    @Override
    public List<ClassEntity> readAll() {
        return this.classRepo.findAll();
    }

    @Override
    public ClassEntity readByID(String id) {
        return this.classRepo.findById(id).orElseThrow();
    }

    /*@Override
    public String create(ClassRequest classRequest) {
        return "";
    }*/

    @Override
    public ClassEntity save(ClassEntity classEntity) {
        return this.classRepo.save(classEntity);
    }

    @Override
    public void destroy(String id) {
        this.classRepo.deleteById(id);
    }
}
