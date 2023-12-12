package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.exception.StudentNotPresentExcpetion;
import com.example.GradeFirstDay.model.StudentDto;
import com.example.GradeFirstDay.model.StudentEntity;
import com.example.GradeFirstDay.repo.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j

public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;

    @Override
    public void addStudent(List<StudentDto> sList) {
        for (StudentDto studentDto: sList) {
            StudentEntity student = convertToEntity(studentDto);
            student = studentRepo.save(student);
        }
    }

    public List<StudentDto> getStudent() {
        List<StudentEntity> students = studentRepo.findAll();
        return students.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    /**
     *
     orElseThrow is a method provided by the Optional class in Java.
     It is used to retrieve the value from the Optional if it is present, and if it's not present,
     an exception is thrown. This is useful in situations where you expect the Optional to contain a value,
     and if it doesn't, you want to handle it by throwing a specific exception.
     * @param studentId
     * @return
     */
    public StudentDto getStudent(Long studentId) {
        // ask query
        log.info("getStudentEntity id {}",studentId); // security issue
        StudentEntity student = studentRepo.findById(studentId)
                .orElseThrow(() -> new StudentNotPresentExcpetion("Student not found with ID"));

        return convertToDto(student);
    }


    // Helper methods to convert between Entity and DTO
    private StudentEntity convertToEntity(StudentDto studentDto) {
        StudentEntity student = new StudentEntity();
        student.setStudentID(studentDto.getStudentID());
        student.setStudentName(studentDto.getStudentName());
        student.setGradeId(studentDto.getGradeId());
        return student;
    }

    private StudentDto convertToDto(StudentEntity studentEntity) {
        StudentDto student = new StudentDto();
        student.setStudentID(studentEntity.getStudentID());
        student.setStudentName(studentEntity.getStudentName());
        student.setGradeId(studentEntity.getGradeId());
        return student;
    }
}