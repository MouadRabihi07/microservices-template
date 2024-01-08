package com.ensa.student.repositories;

import com.ensa.student.entities.CourseId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseIdRepository extends JpaRepository<CourseId,Integer> {

//    public List<CourseId> findByCourseId(CourseId courseId);
}
