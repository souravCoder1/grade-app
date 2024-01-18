package com.example.GradeFirstDay.Entity;

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
    @OneToOne(mappedBy = "studentEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private StudentIdCard studentIdCard;
    public void addStudentIdCard(StudentIdCard studentIdCard) {
        this.studentIdCard = studentIdCard;
        studentIdCard.setStudentEntity(this);
    }

}
