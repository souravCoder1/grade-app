package com.example.GradeFirstDay.repo;

import com.example.GradeFirstDay.model.Grade;
import com.example.GradeFirstDay.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
