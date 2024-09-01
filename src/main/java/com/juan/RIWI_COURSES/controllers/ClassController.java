package com.juan.RIWI_COURSES.controllers;

import com.juan.RIWI_COURSES.entities.ClassEntity;
import com.juan.RIWI_COURSES.services.interfaces.ClassService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/class")
public class ClassController {
    @Autowired
    ClassService classService;

    //GET CLASSES

    @GetMapping
    public ResponseEntity<Page<ClassEntity>> getPaginatedClasses(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<ClassEntity> paginatedClasses = classService.getPaginatedClasses(name, description, page, size);

        //Check if paginated classes are empty
        if (paginatedClasses.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(paginatedClasses);
    }

    //FIND CLASS BY ID

    @GetMapping("{id}")
    public ResponseEntity<ClassEntity> getById(@PathVariable String id){
        Optional<ClassEntity> optionalClassEntity = classService.getClassById(id);

        if (optionalClassEntity.isPresent()){
            return ResponseEntity.ok(optionalClassEntity.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    //SAVE CLASS

    @PostMapping
    public ResponseEntity<ClassEntity> saveClass(@Valid @RequestBody ClassEntity classToSave){
        ClassEntity classSaved = classService.save(classToSave);

        return ResponseEntity.status(HttpStatus.CREATED).body(classSaved);
    }
}
