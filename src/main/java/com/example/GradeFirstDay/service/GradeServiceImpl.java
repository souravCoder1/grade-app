package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.Grade;
import com.example.GradeFirstDay.repo.GradeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("imp2")
@Slf4j

public class GradeServiceImpl implements GradeService{

    public GradeServiceImpl(GradeRepo repo) {
        this.repo = repo;
        log.info("imp2");
    }

    @Autowired
    GradeRepo repo;


    @Override
    public List<Grade> saveGrades(List<Grade> gList) {

        repo.saveAll(gList);
        return gList;
    }

  //  @Override
  //  public void deleteGradeByName(String name) {
//
// }

    @Override
    public List<Grade> getAllGrades() {

        return repo.findAll();
    }

  //  @Override
   // public void updateGradeByName(String name, String score) {
   // }
}
