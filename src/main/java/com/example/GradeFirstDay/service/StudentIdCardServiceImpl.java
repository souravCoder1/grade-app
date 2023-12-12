package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.StudentEntity;
import com.example.GradeFirstDay.model.StudentIdCard;
import com.example.GradeFirstDay.repo.StudentIdCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentIdCardServiceImpl implements StudentIdCardService {

    @Autowired
    StudentIdCardRepo studentIdCardRepo; // injects dependencies (constructor & setter injections)
    @Override
    public StudentIdCard addStudentIdCard(StudentIdCard studentIdCard) {
        return studentIdCardRepo.save(studentIdCard);
    }

    @Override
    public Optional<StudentIdCard> getStudentIdCard(Long id) {
        return studentIdCardRepo.findById(id);

    }
}
