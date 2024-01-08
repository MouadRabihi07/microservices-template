package com.ensa.student.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"courseIds"})
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;

    @OneToMany(mappedBy = "student"/*, fetch = FetchType.EAGER, cascade = CascadeType.ALL*/)
    @JsonManagedReference
    private List<CourseId> courseIds;


}
