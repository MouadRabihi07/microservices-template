package com.ensa.course.repositories;

import com.ensa.course.entities.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentIdRepository extends JpaRepository<StudentId, Integer> {
}
