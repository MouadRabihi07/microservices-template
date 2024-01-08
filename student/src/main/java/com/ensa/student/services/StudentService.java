package com.ensa.student.services;

import com.ensa.student.dto.CourseDto;
import com.ensa.student.entities.Student;
import com.ensa.student.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }

    public List<Student> findAllStudents() {
        return repository.findAll();
    }


    public List<CourseDto> getCourses(Integer studentId){
        return null;
    }
}
