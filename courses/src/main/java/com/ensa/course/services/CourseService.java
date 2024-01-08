package com.ensa.course.services;


import com.ensa.course.clients.StudentClient;
import com.ensa.course.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class CourseService {

    private final StudentClient studentClient;

    public List<StudentDto> getStudents(Integer courseId){
        return null;
    }

}
