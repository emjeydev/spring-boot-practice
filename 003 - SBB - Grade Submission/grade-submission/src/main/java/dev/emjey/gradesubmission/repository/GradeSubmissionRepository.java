package dev.emjey.gradesubmission.repository;

import dev.emjey.gradesubmission.pojo.Grade;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// This file is made by EmJey
// Project: Grade.java
// FileName: GradeSubmissionRepository.java
// Date: 2023/09/11
// Modified Date: 2023/12/04
// Email: emjeydev@gmail.com
// Github: emjeydev

@Repository
public class GradeSubmissionRepository {

    private List<Grade> studentList = new ArrayList<>();

    public Grade getGrade(int index) {
        return studentList.get(index);
    }

    public void addGrade(Grade grade) {
        studentList.add(grade);
    }

    public void updateGrade(Grade grade, int index) {
        studentList.set(index,grade);
    }

    public List<Grade> getGrades() {
        return studentList;
    }
}
