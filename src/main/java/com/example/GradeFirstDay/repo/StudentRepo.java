package com.example.GradeFirstDay.repo;

import com.example.GradeFirstDay.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Long> {
}
