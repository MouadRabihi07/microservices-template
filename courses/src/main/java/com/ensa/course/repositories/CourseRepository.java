package com.ensa.course.repositories;


import com.ensa.course.entities.Course;
import com.ensa.course.entities.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

    List<Course> findAllByStudentIdsContaining(Integer studentId);


}
