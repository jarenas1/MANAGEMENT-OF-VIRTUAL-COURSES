package com.juan.RIWI_COURSES.repositories;

import com.juan.RIWI_COURSES.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {

}
