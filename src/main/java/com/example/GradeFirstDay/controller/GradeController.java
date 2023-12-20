package com.example.GradeFirstDay.controller;

import com.example.GradeFirstDay.model.Grade;
//import com.example.GradeFirstDay.repo.GradeRepo;
//import com.example.GradeFirstDay.service.GradeService;
//import com.example.GradeFirstDay.service.GradeServiceImpl;
import com.example.GradeFirstDay.service.GradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@Slf4j

public class GradeController {

    //GradeService service= new GradeServiceImpl();

   // List<Grade> grades = new ArrayList<>();
    @Autowired
    @Qualifier("imp2")
    private GradeService service;


    @GetMapping("/grades")
    public List<Grade> getGrades() {
        log.info("get grade request");
        return service.getAllGrades();
    }


    @PostMapping("/grades")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<Grade> createGrade(@Valid @RequestBody List<Grade> gList) {
       log.info("add grade service {}",gList);
       return service.saveGrades(gList);
    }

   // @GetMapping("/grades/{name}")
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    //public void getGradesByName(@Valid @PathVariable String name) {
    //        return;

   // }

}

//    @PutMapping("/grades/{name}/{score}")
//    //@ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<Grade> updateGradeByName(@PathVariable String name ,@PathVariable String score) {
//        service.updateGradeByName(name,score);
//        return new ResponseEntity("Success",HttpStatus.CREATED);
//    }
//
//
//    @DeleteMapping("/grades/{name}")
//    public void  delGradesByName(@PathVariable String name) {
//        service.deleteGradeByName(name);
//        return;
//    }


//    @GetMapping("/grades/{name}")
//    public Grade getGradesByName(@PathVariable String name) {
//        Grade grade = service.findByName(name);
//        return grade;
//    }



//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String, String> handleValidationExceptions(
//            MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return errors;
//    }

