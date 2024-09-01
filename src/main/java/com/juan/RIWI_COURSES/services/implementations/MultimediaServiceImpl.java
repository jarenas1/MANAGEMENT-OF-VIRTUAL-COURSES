package com.juan.RIWI_COURSES.services.implementations;

import com.juan.RIWI_COURSES.dtos.request.MultimediaRequest;
import com.juan.RIWI_COURSES.entities.MultimediaEntity;
import com.juan.RIWI_COURSES.repositories.MultimediaRepository;
import com.juan.RIWI_COURSES.services.interfaces.MultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultimediaServiceImpl implements MultimediaService {
        //Atributos de MediaServiceImpl
    @Autowired
    private MultimediaRepository multimediaRepo;

    //Constructores de MediaServiceImpl
    //Asignadores de atributos de MediaServiceImpl (setters)
    //Lectores de atributos de MediaServiceImpl (getters)
        //Métodos de MediaServiceImpl
    @Override
    public List<MultimediaEntity> readAll() {
        return this.multimediaRepo.findAll();
    }

    @Override
    public MultimediaEntity readByID(String id) {
        return this.multimediaRepo.findById(id).orElseThrow();
    }

    /*@Override
    public String create(MultimediaRequest multimediaRequest) {
        return "";
    }*/

    @Override
    public MultimediaEntity save(MultimediaEntity multimediaEntity) {
        return this.multimediaRepo.save(multimediaEntity);
    }

    @Override
    public void destroy(String id) {
        this.multimediaRepo.deleteById(id);
    }
}
