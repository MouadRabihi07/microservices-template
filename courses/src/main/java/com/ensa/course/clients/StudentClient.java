package com.ensa.course.clients;

import com.ensa.course.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "students", url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping("/api/v1/students/courses/{course-id}")
    List<StudentDto> findAllStudentsBySchool(@PathVariable("course-id") Integer courseId);
}
