package com.juan.RIWI_COURSES.controllers;

import com.juan.RIWI_COURSES.dtos.request.StudentRequest;
import com.juan.RIWI_COURSES.dtos.response.StudentResponse;
import com.juan.RIWI_COURSES.entities.ClassEntity;
import com.juan.RIWI_COURSES.entities.StudentEntity;
import com.juan.RIWI_COURSES.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {
    @Autowired
    StudentService studentService;

    //FIND BY ID
    @GetMapping("Students/{id}")
    public ResponseEntity<StudentResponse> findById(@PathVariable String id){
        StudentEntity studentById = studentService.readByID(id);

       StudentResponse studentResponse = StudentResponse.builder().name(studentById.getName())
               .email(studentById.getEmail())
               .active(studentById.getActive())
               .classes(studentById.getClasses()).build();

       return ResponseEntity.ok(studentResponse);
    }


    //LIST OF ACTIVE STUDENTS

    @GetMapping("students")
    public  ResponseEntity<ArrayList<StudentResponse>> readActive(){
        ArrayList<StudentEntity> studentEntities = (ArrayList<StudentEntity>) studentService.readAll();
        ArrayList<StudentResponse> studentResponses = new ArrayList<>();
        studentEntities.stream().map(studentEntity ->
        {
            if (studentEntity.getActive() == true) {
                StudentResponse studentActive = StudentResponse.builder().name(studentEntity.getName())
                        .email(studentEntity.getEmail())
                        .classes(studentEntity.getClasses())
                        .active(studentEntity.getActive()).build();

                studentResponses.add(studentActive);
            }
            return studentResponses;
        }).collect(Collectors.toList());

        return ResponseEntity.ok(studentResponses);
    }

    //Save

    @PostMapping("students")
    public ResponseEntity<StudentEntity> save (@RequestBody StudentRequest studentRequest){
        StudentEntity studentEntity = StudentEntity.builder()
                .id(studentRequest.getId())
                .name(studentRequest.getName())
                .email(studentRequest.getEmail())
                .creatAt(LocalDateTime.now())
                .active(true)
                .class_id(new ClassEntity())
                .classes(new ArrayList<ClassEntity>()).build();

        studentService.save(studentEntity);
        return ResponseEntity.ok(studentEntity);
    }
}
