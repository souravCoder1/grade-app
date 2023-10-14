package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.Grade;
import com.example.GradeFirstDay.model.Student;
import com.example.GradeFirstDay.repo.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j

public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> addStudent(List<Student> sList) {
        studentRepo.saveAll(sList);
        return sList;
    }


   // public Optional<Student> deleteStudentByName(Long studentId) {
   //     return studentRepo.deleteById(studentId);
   // }


  //  public void updateStudentByName(String name, String score) {
   // }

    public List<Student> getStudent() {
        return studentRepo.findAll();

    }

    public List<Student> getStudent(Long StudentId) {
        // ask query
        log.info("getStudent id {}",StudentId);
        Optional<Student> studentOptional= studentRepo.findById(StudentId);
        Student student=studentOptional.get();
        Long gradeId= student.getGradeId();
        return (List<Student>) student;
    }



}