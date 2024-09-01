package com.juan.RIWI_COURSES.repositories;

import com.juan.RIWI_COURSES.entities.ClassEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClassRepository extends JpaRepository<ClassEntity, String> {

    Page<ClassEntity> findPageable (String name, String description, Pageable pageable);
    Optional<ClassEntity> findByIdAndActive(String id);

}
