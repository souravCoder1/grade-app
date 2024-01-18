package com.example.GradeFirstDay.repo;

import com.example.GradeFirstDay.Entity.StudentIdCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentIdCardRepo extends JpaRepository<StudentIdCard, Long> {
}
