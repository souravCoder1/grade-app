package com.example.GradeFirstDay.controller;


import com.example.GradeFirstDay.model.Course;
import com.example.GradeFirstDay.model.Student;
import com.example.GradeFirstDay.service.EnrollementService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// for a student save the list courses
@RestController //("api/v1/student")
@Slf4j

public class EnrollmentController {

    @Autowired
    private EnrollementService enrollementService;
    private Student student;
// publish on web page
    @GetMapping("/enroll/{id}")
    public List<Course> getEnrollment(@PathVariable Long id) {
        log.info("get enrollment request");
        return enrollementService.getEnrollment(student);
    }

    @PostMapping
    public void createEnrollment(@Valid @RequestBody Student student,@RequestBody  List<Course> clist) {
        log.info("enroll student {}",student);
         enrollementService.createEnrollment(student, clist);
    }

}
