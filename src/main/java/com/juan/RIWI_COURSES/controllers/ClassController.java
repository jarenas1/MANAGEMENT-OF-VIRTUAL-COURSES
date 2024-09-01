package com.juan.RIWI_COURSES.controllers;

import com.juan.RIWI_COURSES.entities.ClassEntity;
import com.juan.RIWI_COURSES.services.interfaces.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/class")
public class ClassController {
    @Autowired
    ClassService classService;

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

    @GetMapping("{id}")
    public ResponseEntity getById(@PathVariable String id){
        Optional<ClassEntity> optionalClassEntity = classService.getClassById(id);

        if (optionalClassEntity.isPresent()){
            return ResponseEntity.ok(optionalClassEntity.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
