package com.example.GradeFirstDay.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    //@JsonProperty
    private String cardNo;

    @OneToOne(cascade = CascadeType.MERGE,
    fetch = FetchType.LAZY)
   // @JsonIgnore
    @JoinColumn(
            name= "student_id",
            referencedColumnName = "studentID"
    )
    private Student student;

}
