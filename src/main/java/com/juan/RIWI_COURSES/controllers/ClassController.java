package com.juan.RIWI_COURSES.controllers;

import com.juan.RIWI_COURSES.services.interfaces.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/class")
public class ClassController {
    @Autowired
    ClassService classService;

    @GetMapping
    public ResponseEntity<Page<Class>> getPaginatedClasses(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<Class> paginatedClasses = classService.getPaginatedClasses(name, description, page, size);

        //Check if paginated classes are empty
        if (paginatedClasses.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(paginatedClasses);
    }
}
