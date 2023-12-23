package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.StudentIdCardDTO;

import java.util.List;
import java.util.Optional;

public interface StudentIdCardService {

    StudentIdCardDTO addStudentIdCard(StudentIdCardDTO studentIdCard);
    StudentIdCardDTO getStudentIdCard(Long id);
    List<StudentIdCardDTO> getCards();

}
