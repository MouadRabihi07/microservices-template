package com.ensa.course.controllers;


import com.ensa.course.entities.Course;
import com.ensa.course.repositories.CourseRepository;
import com.ensa.course.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping("/courses/{course-id}")
    public ResponseEntity<List<Course>> findAllStudents(
            @PathVariable("course-id") Integer courseId
    ) {
        return ResponseEntity.ok(courseRepository.findAllByStudentIdsContaining(courseId));
    }

}
