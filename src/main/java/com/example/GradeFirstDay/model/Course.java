package com.example.GradeFirstDay.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(
        name = "grade"
)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long GradeID;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @JsonProperty("mycourse")
    @NotBlank(message = "courseName is mandatory")
    private String courseName;
    @NotBlank(message = "score is mandatory")
    private String score;
    //@NotBlank(message = "fullMarks is mandatory")
    @JsonIgnore
    private String fullMarks;

}
   /* public Grade(String name, String courseName, String score, String fullMarks) {
        this.name = name;
        this.courseName = courseName;
        this.score = score;
        this.fullMarks = fullMarks;
    }*/

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(String fullMarks) {
        this.fullMarks = fullMarks;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                ", score='" + score + '\'' +
                ", fullMarks='" + fullMarks + '\'' +
                '}';
    }*/


