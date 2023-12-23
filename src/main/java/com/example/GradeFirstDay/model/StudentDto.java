package com.example.GradeFirstDay.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class StudentDto implements Serializable {
    private Long studentID;
    private String studentName;
    private Long gradeId;
    private StudentIdCardDTO studentIdCardDTO;
}
