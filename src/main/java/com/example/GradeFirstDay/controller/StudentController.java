package com.example.GradeFirstDay.controller;

import com.example.GradeFirstDay.model.StudentDto;
import com.example.GradeFirstDay.model.StudentEntity;
import com.example.GradeFirstDay.service.StudentService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public List<StudentDto> getStudent(@PathVariable Long id) {
        log.info("get student request");
        return studentService.getStudent();
    }

    @PostMapping
    public void createStudent(@Valid @RequestBody List<StudentDto> slist) {
        log.info("add student {}",slist);
        studentService.addStudent(slist);
    }

    //@GetMapping("/grades/{name}")
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    //public void getGradesByName(@Valid @PathVariable String name) {
    //    return;

    //}
}
