package com.ensa.student.entities;


import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"student"})

@Entity
@Table(name = "course_ids")
public class CourseId {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer courseId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
