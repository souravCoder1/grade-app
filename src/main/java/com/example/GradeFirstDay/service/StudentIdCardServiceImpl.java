package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.Entity.StudentIdCard;
import com.example.GradeFirstDay.exception.CardNotPresentExcpetion;
import com.example.GradeFirstDay.model.StudentIdCardDTO;
import com.example.GradeFirstDay.repo.StudentIdCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentIdCardServiceImpl implements StudentIdCardService {

    @Autowired
    StudentIdCardRepo studentIdCardRepo; // injects dependencies (constructor & setter injections)

    @Override
    public StudentIdCardDTO addStudentIdCard(StudentIdCardDTO studentIdCard) {
        StudentIdCard card = convertToEntity(studentIdCard);
        studentIdCardRepo.save(card);
        return convertToDto(card);
    }

    @Override
    public StudentIdCardDTO getStudentIdCard(Long id) {
        StudentIdCard card = studentIdCardRepo.findById(id)
                .orElseThrow(() -> new CardNotPresentExcpetion("Card not found with ID"));
        return convertToDto(card);
    }

    @Override
    public List<StudentIdCardDTO> getCards() {
        List<StudentIdCard> cards = studentIdCardRepo.findAll();
        return cards.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    // Helper methods to convert between Entity and DTO
    public StudentIdCard convertToEntity(StudentIdCardDTO studentIdCardDTO) {
        StudentIdCard card = new StudentIdCard();
        card.setCardNo(studentIdCardDTO.getCardNo());
        return card;
    }

    public StudentIdCardDTO convertToDto(StudentIdCard studentIdCard) {
        StudentIdCardDTO card = new StudentIdCardDTO();
        card.setCardNo(studentIdCard.getCardNo());
        return card;
    }
}
