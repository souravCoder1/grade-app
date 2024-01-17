package com.example.GradeFirstDay.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

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

    @OneToOne(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY)
   // @JsonIgnore
    @JoinColumn(
            name= "student_id_FK",
            referencedColumnName = "studentID"
    )
    private StudentEntity studentEntity;
}
