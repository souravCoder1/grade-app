package com.example.GradeFirstDay.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

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
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentID;
    //@NotBlank(message = "Name is mandatory")
    private String studentName;
    private Long gradeId;
    @JsonIgnore
    @OneToOne(mappedBy = "studentEntity", fetch = FetchType.LAZY)
  private  StudentIdCard studentIdCard;

}
