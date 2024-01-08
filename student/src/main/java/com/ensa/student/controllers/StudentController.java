package com.ensa.student.controllers;

import com.ensa.student.entities.Student;
import com.ensa.student.repositories.CourseIdRepository;
import com.ensa.student.repositories.StudentRepository;
import com.ensa.student.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;
    private final StudentRepository studentRepository;
    private final CourseIdRepository courseIdRepository;


    @GetMapping("/courses/{course-id}")
    public ResponseEntity<List<Student>> findAllStudents(
            @PathVariable("course-id") Integer courseId
    ) {
        return ResponseEntity.ok(studentRepository.findAllByCourseIdsContaining(courseId));
    }
}
