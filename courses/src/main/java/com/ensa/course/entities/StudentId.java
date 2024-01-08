package com.ensa.course.entities;


import com.ensa.course.entities.Course;
import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(exclude = {"course"})

@Entity
@Table(name = "student_ids")
public class StudentId {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer studentId;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

}
