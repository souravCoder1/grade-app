package com.example.GradeFirstDay.controller;

import com.example.GradeFirstDay.model.Student;
import com.example.GradeFirstDay.service.StudentService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService Studentservice;

    @GetMapping("/{id}")
    public List<Student> getStudent(@PathVariable Long id) {
        log.info("get student request");
        return Studentservice.getStudent();
    }

    @PostMapping
    public List<Student> createStudent(@Valid @RequestBody List<Student> slist) {
        log.info("add student {}",slist);
       return Studentservice.addStudent(slist);
    }

    //@GetMapping("/grades/{name}")
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    //public void getGradesByName(@Valid @PathVariable String name) {
    //    return;

    //}
}
