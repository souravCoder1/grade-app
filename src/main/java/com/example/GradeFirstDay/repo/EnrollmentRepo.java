package com.example.GradeFirstDay.repo;

import com.example.GradeFirstDay.model.Enrolment;
import com.example.GradeFirstDay.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepo extends JpaRepository<Enrolment, Long> {
}
