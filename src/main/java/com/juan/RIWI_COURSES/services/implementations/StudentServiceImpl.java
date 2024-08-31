package com.juan.RIWI_COURSES.services.implementations;

import com.juan.RIWI_COURSES.dtos.request.StudentRequest;
import com.juan.RIWI_COURSES.entities.StudentEntity;
import com.juan.RIWI_COURSES.repositories.StudentRepository;
import com.juan.RIWI_COURSES.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
        //Atributos de StudentServiceImpl
    @Autowired
    private StudentRepository studentRepo;

    //Constructores de StudentServiceImpl
    //Asignadores de atributos de StudentServiceImpl (setters)
    //Lectores de atributos de StudentServiceImpl (getters)
        //Métodos de StudentServiceImpl
    @Override
    public List<StudentEntity> readAll() {
        return this.studentRepo.findAll();
    }

    @Override
    public StudentEntity readByID(String id) {
        return this.studentRepo.findById(id).orElseThrow();
    }

    /*@Override
    public StudentEntity create(StudentRequest studentRequest) {
        return this.studentRepo.save(studentRequest);
    }*/

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        return this.studentRepo.save(studentEntity);
    }

    @Override
    public void destroy(StudentEntity studentEntity) {
        this.studentRepo.delete(studentEntity);
    }

}
