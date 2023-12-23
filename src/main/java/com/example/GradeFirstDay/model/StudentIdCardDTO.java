package com.example.GradeFirstDay.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class StudentIdCardDTO implements Serializable {
    private Long id;
    private String cardNo;
}
