package com.example.GradeFirstDay.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Enrolment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@NotBlank(message = "Name is mandatory")


    @Column(name= "createdAt")
    private Date createdAt;

    @ManyToMany
    @JoinColumn(
            name= "student_id",
            referencedColumnName = "studentID"
    )
    private Student student;

    @ManyToMany
    @JoinColumn(
            name= "course_id",
            referencedColumnName = "courseID"
    )
    private Course course;




}
