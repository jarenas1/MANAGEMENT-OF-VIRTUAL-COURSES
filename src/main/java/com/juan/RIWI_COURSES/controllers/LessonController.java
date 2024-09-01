package com.juan.RIWI_COURSES.controllers;

import com.juan.RIWI_COURSES.dtos.request.LessonRequest;
import com.juan.RIWI_COURSES.services.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/")
public class LessonController {
    @Autowired
    LessonService lessonService;

    @PostMapping("lesson")
    public ResponseEntity<LessonRequest>save(@RequestBody LessonRequest lessonRequest){

    }

}
