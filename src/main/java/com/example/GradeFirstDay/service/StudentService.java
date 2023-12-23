package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.StudentDto;
import com.example.GradeFirstDay.model.StudentEntity;

import java.util.List;

//@Slf4j
public interface StudentService {

        void addStudent(List<StudentDto> students);
       //void deleteStudentByName(String name);
        //List<StudentEntity> getAllGrades();
        //void updateGradeByName(String name,String score);
        List<StudentDto> getStudent();
        StudentDto getStudent(Long StudentId);
}
