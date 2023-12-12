package com.example.GradeFirstDay.controller;

import com.example.GradeFirstDay.exception.CardNotPresentExcpetion;
import com.example.GradeFirstDay.model.StudentIdCard;
import com.example.GradeFirstDay.model.StudentIdCardDTO;
import com.example.GradeFirstDay.service.StudentIdCardService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/card")
@Slf4j
public class StudentIdCardController {

    @Autowired
    private StudentIdCardService studentIdCardService;
    @GetMapping("/{id}")
    public StudentIdCardDTO getStudentIdCard(@PathVariable Long id) {
        log.info("get student request");
        Optional<StudentIdCard> studentIdCard = studentIdCardService.getStudentIdCard(id);
        if(studentIdCard.isPresent()) {
            StudentIdCardDTO cardDTO = convertToDTO(studentIdCard.get());
            return cardDTO;
        } else {
            throw new CardNotPresentExcpetion("");
        }
    }

    private StudentIdCardDTO convertToDTO(StudentIdCard studentIdCard) {
        StudentIdCardDTO card = new StudentIdCardDTO();
        card.setCardNo(studentIdCard.getCardNo());
        return card;
    }

    @PostMapping
    public StudentIdCard createStudentId(@Valid @RequestBody StudentIdCard slist) {
        log.info("add student {}",slist);
        return studentIdCardService.addStudentIdCard(slist);
    }
}
