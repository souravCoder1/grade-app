package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

//@Slf4j
public interface StudentService {

        List<Student> addStudent(List<Student> student);
       //void deleteStudentByName(String name);
        //List<Student> getAllGrades();
        //void updateGradeByName(String name,String score);

        List<Student> getStudent();
        List<Student> getStudent(Long StudentId);
}
