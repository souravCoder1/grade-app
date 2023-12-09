package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.Course;
import com.example.GradeFirstDay.model.Enrolment;
import com.example.GradeFirstDay.model.Student;
import com.example.GradeFirstDay.model.StudentIdCard;
import com.example.GradeFirstDay.repo.EnrollmentRepo;
import com.example.GradeFirstDay.repo.StudentIdCardRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class EnrollmentServiceImpl implements EnrollementService{
    @Autowired
    EnrollmentRepo enrollmentRepo; // injects dependencies (constructor & setter injections)
    HashMap enrollMap= new HashMap<>();
    Enrolment enroll;

    @Override
    public void createEnrollment(Student student, List<Course> courseList) {
        // stid,cid,date
        //  ()
        // save enrolment table
        // hasmap stuednt,list of courses

        enrollMap.put(student.getStudentID(),courseList);

        enrollmentRepo.save();

    }

    @Override
    public List<Course> getAllCourses(Course course) {
        return null;
    }
}
