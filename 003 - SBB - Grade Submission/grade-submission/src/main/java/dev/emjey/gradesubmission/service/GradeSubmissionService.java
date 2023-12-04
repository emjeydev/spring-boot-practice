package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.Constants;
import dev.emjey.gradesubmission.pojo.Grade;
import dev.emjey.gradesubmission.repository.GradeSubmissionRepository;

import java.util.List;

// This file is made by EmJey
// Project: Grade.java
// FileName: GradeSubmissionService.java
// Date: 2023/09/11
// Modified Date: 2023/12/04
// Email: emjeydev@gmail.com
// Github: emjeydev

public class GradeSubmissionService {

    GradeSubmissionRepository gradeSubmissionRepository = new GradeSubmissionRepository();

    public Grade getGrade(int index) {
        return gradeSubmissionRepository.getGrade(index);
    }

    public void addGrade(Grade grade) {
        gradeSubmissionRepository.addGrade(grade);
    }

    public void updateGrade(Grade grade, int index) {
        gradeSubmissionRepository.updateGrade(grade, index);
    }

    public List<Grade> getGrades() {
        return gradeSubmissionRepository.getGrades();
    }

    public Integer getGradeIndex(String id) {
        for (int i = 0; i < getGrades().size(); i++) {
            if (getGrades().get(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }

    public Grade getGradeById(String id) {
        int index = getGradeIndex(id);

        return index == Constants.NOT_FOUND ? new Grade() : getGrade(index);
    }

    public void submitGrade(Grade grade) {
        int index = getGradeIndex(grade.getId());
        if (index == Constants.NOT_FOUND) {
            addGrade(grade);
        } else {
            updateGrade(grade, index);
        }
    }
}
