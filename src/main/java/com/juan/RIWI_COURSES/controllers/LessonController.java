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


}
