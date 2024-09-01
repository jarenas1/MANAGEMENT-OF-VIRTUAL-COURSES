package com.juan.RIWI_COURSES.services.implementations;

import com.juan.RIWI_COURSES.entities.ClassEntity;
import com.juan.RIWI_COURSES.repositories.ClassRepository;
import com.juan.RIWI_COURSES.services.interfaces.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassRepository classRepo;

    @Override
    public ClassEntity save(ClassEntity classEntity) {
        return this.classRepo.save(classEntity);
    }

    @Override
    public void destroy(String id) {
        this.classRepo.deleteById(id);
    }

    @Override
    public Page<ClassEntity> getPaginatedClasses(String name, String description, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return classRepo.findPageable(name,description,pageable);
    }

    @Override
    public Optional<ClassEntity> getClassById(String id) {
        return classRepo.findByIdAndActive(id);
    }
}
