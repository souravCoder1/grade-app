package com.example.GradeFirstDay.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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

    @OneToOne(cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
   // @JsonIgnore
    @JoinColumn(
            name= "student_id_FK",
            referencedColumnName = "studentID"
    )
    private StudentEntity studentEntity;
}
