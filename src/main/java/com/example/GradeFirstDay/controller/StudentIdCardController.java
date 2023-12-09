package com.example.GradeFirstDay.controller;

import com.example.GradeFirstDay.exception.CardNotPresentExcpetion;
import com.example.GradeFirstDay.model.Student;
import com.example.GradeFirstDay.model.StudentIdCard;
import com.example.GradeFirstDay.service.StudentIdCardService;
import com.example.GradeFirstDay.service.StudentService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/card")
@Slf4j
public class StudentIdCardController {

    @Autowired
    private StudentIdCardService studentIdCardService;

    @GetMapping("/{id}")
    public StudentIdCard getStudentIdCard(@PathVariable Long id) {
        log.info("get student request");
        Optional<StudentIdCard> studentIdCard = studentIdCardService.getStudentIdCard(id);
        if(studentIdCard.isPresent()) {
            return studentIdCard.get();
        } else {
            throw new CardNotPresentExcpetion("");
        }
    }

    @PostMapping
    public StudentIdCard createStudentId(@Valid @RequestBody StudentIdCard slist) {
        log.info("add student {}",slist);
        return studentIdCardService.addStudentIdCard(slist);
    }
}
