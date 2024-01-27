package dev.emjey.gradesubmission.service;

import dev.emjey.gradesubmission.entity.Grade;

import java.util.List;

// This file is made by EmJey
// Project: GradeSubmission - Spring JPA
// FileName: GradeServiceImpl.java
// Date: 2024/01/27
// Modified Date: 2024/01/27
// Email: emjeydev@gmail.com
// Github: emjeydev

public class GradeServiceImpl implements GradeService {
    
    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        return null;
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        return null;
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        return null;
    }

    @Override
    public void deleteGrade(Long studentId, Long courseId) {
        
    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return null;
    }

    @Override
    public List<Grade> getCourseGrades(Long courseId) {
        return null;
    }

    @Override
    public List<Grade> getAllGrades() {
        return null;
    }

}
