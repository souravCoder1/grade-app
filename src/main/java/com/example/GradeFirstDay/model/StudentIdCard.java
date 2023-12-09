package com.example.GradeFirstDay.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
        name = "StudentIdCard"
)
public class StudentIdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@NotBlank(message = "Name is mandatory")


    @Column(name= "cardNo")
    private String cardNo;

    @OneToOne
    @JoinColumn(
            name= "student_id",
            referencedColumnName = "studentID"
    )
    private Student student;




}
