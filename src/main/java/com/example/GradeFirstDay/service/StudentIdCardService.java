package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.StudentIdCard;

import java.util.Optional;

public interface StudentIdCardService {

    StudentIdCard addStudentIdCard(StudentIdCard studentIdCard);
    Optional<StudentIdCard> getStudentIdCard(Long id);

}
