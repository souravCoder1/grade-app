package com.example.GradeFirstDay.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(
        name = "student"
)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long StudentID;
    @NotBlank(message = "Name is mandatory")
    private String Studentname;
}
