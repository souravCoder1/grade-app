package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.Grade;

import java.util.List;

public interface GradeService {
    List<Grade> saveGrades(List<Grade> gList);
   // void deleteGradeByName(String name);
    List<Grade> getAllGrades();

  //  void updateGradeByName(String name,String score);
}
