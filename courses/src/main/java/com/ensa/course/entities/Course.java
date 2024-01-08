package com.ensa.course.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"studentIds"})


public class Course {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "course"/*, fetch = FetchType.EAGER, cascade = CascadeType.ALL*/)
    @JsonManagedReference
    private List<StudentId> studentIds;
}
