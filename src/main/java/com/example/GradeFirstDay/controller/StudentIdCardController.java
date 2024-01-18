package com.example.GradeFirstDay.controller;

import com.example.GradeFirstDay.model.StudentIdCardDTO;
import com.example.GradeFirstDay.service.StudentIdCardService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/card")
@Slf4j
public class StudentIdCardController {

    @Autowired
    private StudentIdCardService studentIdCardService;

    @GetMapping
    public List<StudentIdCardDTO> getCard() {
        log.info("get student request");
        return studentIdCardService.getCards();
    }
    @GetMapping("/{id}")
    public StudentIdCardDTO getStudentIdCard(@PathVariable Long id) {
        log.info("get student request");
        StudentIdCardDTO studentIdCard = studentIdCardService.getStudentIdCard(id);
        return studentIdCard;
    }

    @PostMapping
    public StudentIdCardDTO createStudentId(@Valid @RequestBody StudentIdCardDTO card) {
        log.info("add student {}",card);
        return studentIdCardService.addStudentIdCard(card);
    }
}
