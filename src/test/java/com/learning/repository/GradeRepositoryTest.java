package com.learning.repository;

import java.util.List;

import com.example.GradeFirstDay.repo.GradeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.GradeFirstDay.model.Grade;


@SpringBootTest
public class GradeRepositoryTest {

    @Autowired
    private GradeRepo GradeRepo;

    @Test
    public void saveStudent() {
        Grade grade = Grade.builder()
                .fullMarks("100")
                .courseName("Maths")
                .name("Dpk")
                .score("99")
                //.guardianName("Nikhil")
                //.guardianEmail("nikhil@gmail.com")
                //.guardianMobile("9999999999")
                .build();

        GradeRepo.save(grade);
    }


}
