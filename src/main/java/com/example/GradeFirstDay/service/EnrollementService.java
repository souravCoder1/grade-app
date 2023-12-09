package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.Course;
import com.example.GradeFirstDay.model.Grade;
import com.example.GradeFirstDay.model.Student;

import java.util.List;

public interface EnrollementService {
    public void createEnrollment(Student student, List<Course> gList) ;

    public List<Course> getEnrollment(Student student);


}
