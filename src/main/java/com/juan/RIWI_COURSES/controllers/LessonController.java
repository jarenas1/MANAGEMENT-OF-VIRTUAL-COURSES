package com.juan.RIWI_COURSES.controllers;

import com.juan.RIWI_COURSES.dtos.request.LessonRequest;
import com.juan.RIWI_COURSES.entities.LessonEntity;
import com.juan.RIWI_COURSES.services.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/vi/")
public class LessonController {
    @Autowired
    LessonService lessonService;


    @PostMapping("lesson")
    public ResponseEntity<LessonEntity>save(@RequestBody LessonRequest lessonRequest){
        LessonEntity lessonEntity = LessonEntity.builder().id(lessonRequest.getId())
                .name(lessonRequest.getName())
                .multimedia(new ArrayList<>())
                .status(true).build();

        lessonService.save(lessonEntity);

        return ResponseEntity.ok(lessonEntity);
    }

    @GetMapping("lesson/{id}")
    public ResponseEntity<LessonEntity>findById(@PathVariable String id){
        LessonEntity lessonEntity = lessonService.readByID(id);

        return ResponseEntity.ok(lessonEntity);
    }

}
