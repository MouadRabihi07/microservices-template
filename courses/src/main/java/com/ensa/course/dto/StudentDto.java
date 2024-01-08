package com.ensa.course.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class StudentDto {

    private String firstname;
    private String lastname;
    private String email;

}
