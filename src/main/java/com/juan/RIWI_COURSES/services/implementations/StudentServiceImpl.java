package com.juan.RIWI_COURSES.services.implementations;

import com.juan.RIWI_COURSES.dtos.request.StudentRequest;
import com.juan.RIWI_COURSES.dtos.response.StudentResponse;
import com.juan.RIWI_COURSES.entities.StudentEntity;
import com.juan.RIWI_COURSES.repositories.StudentRepository;
import com.juan.RIWI_COURSES.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public List<StudentEntity> readAll() {
        return this.studentRepo.findAll();
    }

    @Override
    public StudentEntity readByID(String id) {
        return this.studentRepo.findById(id).orElseThrow();
    }

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        return this.studentRepo.save(studentEntity);
    }
}
