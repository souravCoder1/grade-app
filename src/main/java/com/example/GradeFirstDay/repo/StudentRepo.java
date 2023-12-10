package com.example.GradeFirstDay.repo;

import com.example.GradeFirstDay.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Long> {
}
